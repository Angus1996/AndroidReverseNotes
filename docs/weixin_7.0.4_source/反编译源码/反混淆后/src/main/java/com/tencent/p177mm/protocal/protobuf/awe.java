package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.awe */
public final class awe extends bsr {
    public String fKh;
    public int wzF;
    public cxh wzG;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(96268);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.fKh != null) {
                c6093a.mo13475e(2, this.fKh);
            }
            c6093a.mo13480iz(3, this.wzF);
            if (this.wzG != null) {
                c6093a.mo13479iy(4, this.wzG.computeSize());
                this.wzG.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(96268);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.fKh != null) {
                ix += C6091a.m9575f(2, this.fKh);
            }
            ix += C6091a.m9572bs(3, this.wzF);
            if (this.wzG != null) {
                ix += C6087a.m9557ix(4, this.wzG.computeSize());
            }
            AppMethodBeat.m2505o(96268);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(96268);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            awe awe = (awe) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        awe.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(96268);
                    return 0;
                case 2:
                    awe.fKh = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(96268);
                    return 0;
                case 3:
                    awe.wzF = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96268);
                    return 0;
                case 4:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cxh cxh = new cxh();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cxh.populateBuilderWithField(c6086a3, cxh, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        awe.wzG = cxh;
                    }
                    AppMethodBeat.m2505o(96268);
                    return 0;
                default:
                    AppMethodBeat.m2505o(96268);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(96268);
            return -1;
        }
    }
}
