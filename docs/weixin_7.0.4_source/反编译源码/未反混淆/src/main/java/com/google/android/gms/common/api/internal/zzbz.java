package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzbz implements Runnable {
    private final /* synthetic */ zzby zzlx;

    zzbz(zzby zzby) {
        this.zzlx = zzby;
    }

    public final void run() {
        AppMethodBeat.i(60873);
        this.zzlx.zzlw.zzg(new ConnectionResult(4));
        AppMethodBeat.o(60873);
    }
}
