package com.example.imports;

import java.nio.file.Path;
import java.util.Objects;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {
    NaiveCsvReader csvReader;
    ProfileService profileService;
    
    public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = csvReader;
        this.profileService = profileService;
    }
    
    @Override
    public int importFrom(Path csvFile) {
        if (csvFile == null) throw new IllegalArgumentException("csvFile");
        
        List<String[]> rows = csvReader.read(csvFile);
        int successfulImports = 0;
        
        for (String[] row : rows) {
            try {
                if (row.length < 3) {
                    System.out.println("Skipping invalid row: insufficient columns");
                    continue;
                }
                
                String id = row[0].trim();
                String email = row[1].trim();
                String displayName = row[2].trim();
                
                if (id.isEmpty()) {
                    System.out.println("Skipping invalid row: missing id");
                    continue;
                }
                
                if (email.isEmpty()) {
                    System.out.println("Skipping invalid row: missing email");
                    continue;
                }
                
                if (!email.contains("@")) {
                    System.out.println("Skipping invalid row: bad email format");
                    continue;
                }
                
                profileService.createProfile(id, email, displayName);
                successfulImports++;
                
            } catch (Exception e) {
                System.out.println("Skipping invalid row: " + e.getMessage());
            }
        }
        
        return successfulImports;
    }
}
