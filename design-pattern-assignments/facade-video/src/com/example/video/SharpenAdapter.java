package com.example.video;

public class SharpenAdapter {
    private final LegacySharpen legacy;

    public SharpenAdapter(LegacySharpen legacy) {
        this.legacy = legacy;
    }

    public Frame[] applySharpen(Frame[] frames, int strength) {
        String handle = toHandle(frames);
        String sharpenedHandle = legacy.applySharpen(handle, strength);
        return fromHandle(sharpenedHandle, frames);
    }

    private String toHandle(Frame[] frames) {
        return "HANDLE:" + frames.length;
    }

    private Frame[] fromHandle(String handle, Frame[] originalFrames) {
        return originalFrames;
    }
}
