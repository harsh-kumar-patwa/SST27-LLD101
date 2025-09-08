package com.example.report;
import java.nio.file.*; import java.util.*;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter = new JsonWriter();
    private final Zipper zipper = new Zipper();
    private final AuditLog auditLog = new AuditLog();

    public Path export(Map<String,Object> data, Path outDir, String baseName) {
        Objects.requireNonNull(data, "data");
        Objects.requireNonNull(outDir, "outDir");
        Objects.requireNonNull(baseName, "baseName");

        Path json = jsonWriter.write(data, outDir, baseName);
        Path zip = zipper.zip(json, Path.of(baseName + ".zip"));
        auditLog.log("exported " + zip);
        return zip;
    }
}

