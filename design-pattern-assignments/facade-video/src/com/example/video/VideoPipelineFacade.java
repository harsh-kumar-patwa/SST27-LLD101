package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    Decoder decoder;
    FilterEngine filterEngine;
    Encoder encoder;
    SharpenAdapter sharpenAdapter;

    public VideoPipelineFacade() {
        this.decoder = new Decoder();
        this.filterEngine = new FilterEngine();
        this.encoder = new Encoder();
        this.sharpenAdapter = new SharpenAdapter(new LegacySharpen());
    }

    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        Frame[] frames = decoder.decode(src);
        if (gray) {
            frames = filterEngine.grayscale(frames);
        }
        if (scale != null) {
            frames = filterEngine.scale(frames, scale);
        }
        if (sharpenStrength != null) {
            frames = sharpenAdapter.applySharpen(frames, sharpenStrength.intValue());
        }
        return encoder.encode(frames, out);
    }
}
