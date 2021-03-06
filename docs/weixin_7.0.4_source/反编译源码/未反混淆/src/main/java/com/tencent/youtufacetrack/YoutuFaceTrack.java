package com.tencent.youtufacetrack;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.facedetect.FaceStatus;

public class YoutuFaceTrack {
    private static YoutuFaceTrack ATP = null;
    private static long handle = 0;

    private native void NativeConstructor();

    private native void NativeDestructor();

    private static native boolean nativeInit();

    public native FaceStatus[] DoDetectionProcessRGBA(byte[] bArr, int i, int i2);

    public native FaceStatus[] DoDetectionProcessYUV(byte[] bArr, int i, int i2);

    public native boolean Init(byte[] bArr, byte[] bArr2);

    static {
        AppMethodBeat.i(84510);
        System.loadLibrary("facetrackwrap");
        nativeInit();
        AppMethodBeat.o(84510);
    }

    public YoutuFaceTrack() {
        AppMethodBeat.i(84508);
        NativeConstructor();
        AppMethodBeat.o(84508);
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        AppMethodBeat.i(84509);
        NativeDestructor();
        AppMethodBeat.o(84509);
    }
}
