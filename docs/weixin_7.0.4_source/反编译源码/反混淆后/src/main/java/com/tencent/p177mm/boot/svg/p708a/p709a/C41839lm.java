package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.lm */
public final class C41839lm extends C5163c {
    private final int height = 96;
    private final int width = 96;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-4284563);
                canvas.save();
                Paint a = C5163c.m7876a(k2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(66.36202f, 28.0f);
                l.lineTo(76.99543f, 28.0f);
                l.cubicTo(79.20043f, 28.0f, 81.0f, 29.79529f, 81.0f, 32.00989f);
                l.lineTo(81.0f, 71.990105f);
                l.cubicTo(81.0f, 74.20595f, 79.20709f, 76.0f, 76.99543f, 76.0f);
                l.lineTo(19.00457f, 76.0f);
                l.cubicTo(16.79957f, 76.0f, 15.0f, 74.20471f, 15.0f, 71.990105f);
                l.lineTo(15.0f, 32.00989f);
                l.cubicTo(15.0f, 29.794052f, 16.792908f, 28.0f, 19.00457f, 28.0f);
                l.lineTo(29.637974f, 28.0f);
                l.lineTo(36.0f, 22.0f);
                l.lineTo(60.0f, 22.0f);
                l.lineTo(66.36202f, 28.0f);
                l.close();
                l.moveTo(48.0f, 70.0f);
                l.cubicTo(59.045696f, 70.0f, 68.0f, 61.045696f, 68.0f, 50.0f);
                l.cubicTo(68.0f, 38.954304f, 59.045696f, 30.0f, 48.0f, 30.0f);
                l.cubicTo(36.954304f, 30.0f, 28.0f, 38.954304f, 28.0f, 50.0f);
                l.cubicTo(28.0f, 61.045696f, 36.954304f, 70.0f, 48.0f, 70.0f);
                l.close();
                l.moveTo(48.0f, 63.0f);
                l.cubicTo(55.179703f, 63.0f, 61.0f, 57.179703f, 61.0f, 50.0f);
                l.cubicTo(61.0f, 42.820297f, 55.179703f, 37.0f, 48.0f, 37.0f);
                l.cubicTo(40.820297f, 37.0f, 35.0f, 42.820297f, 35.0f, 50.0f);
                l.cubicTo(35.0f, 57.179703f, 40.820297f, 63.0f, 48.0f, 63.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(66.36202f, 28.0f);
                l.lineTo(76.99543f, 28.0f);
                l.cubicTo(79.20043f, 28.0f, 81.0f, 29.79529f, 81.0f, 32.00989f);
                l.lineTo(81.0f, 71.990105f);
                l.cubicTo(81.0f, 74.20595f, 79.20709f, 76.0f, 76.99543f, 76.0f);
                l.lineTo(19.00457f, 76.0f);
                l.cubicTo(16.79957f, 76.0f, 15.0f, 74.20471f, 15.0f, 71.990105f);
                l.lineTo(15.0f, 32.00989f);
                l.cubicTo(15.0f, 29.794052f, 16.792908f, 28.0f, 19.00457f, 28.0f);
                l.lineTo(29.637974f, 28.0f);
                l.lineTo(36.0f, 22.0f);
                l.lineTo(60.0f, 22.0f);
                l.lineTo(66.36202f, 28.0f);
                l.close();
                l.moveTo(48.0f, 70.0f);
                l.cubicTo(59.045696f, 70.0f, 68.0f, 61.045696f, 68.0f, 50.0f);
                l.cubicTo(68.0f, 38.954304f, 59.045696f, 30.0f, 48.0f, 30.0f);
                l.cubicTo(36.954304f, 30.0f, 28.0f, 38.954304f, 28.0f, 50.0f);
                l.cubicTo(28.0f, 61.045696f, 36.954304f, 70.0f, 48.0f, 70.0f);
                l.close();
                l.moveTo(48.0f, 63.0f);
                l.cubicTo(55.179703f, 63.0f, 61.0f, 57.179703f, 61.0f, 50.0f);
                l.cubicTo(61.0f, 42.820297f, 55.179703f, 37.0f, 48.0f, 37.0f);
                l.cubicTo(40.820297f, 37.0f, 35.0f, 42.820297f, 35.0f, 50.0f);
                l.cubicTo(35.0f, 57.179703f, 40.820297f, 63.0f, 48.0f, 63.0f);
                l.close();
                Paint k3 = C5163c.m7883k(looper);
                k3.setFlags(385);
                k3.setStyle(Style.FILL);
                Paint k4 = C5163c.m7883k(looper);
                k4.setFlags(385);
                k4.setStyle(Style.STROKE);
                k3.setColor(WebView.NIGHT_MODE_COLOR);
                k4.setStrokeWidth(1.0f);
                k4.setStrokeCap(Cap.BUTT);
                k4.setStrokeJoin(Join.MITER);
                k4.setStrokeMiter(4.0f);
                k4.setPathEffect(null);
                float[] a2 = C5163c.m7878a(g, 81.0f, 0.0f, 15.0f, 0.0f, 76.0f, 22.0f);
                h.reset();
                h.setValues(a2);
                WeChatSVGRenderC2Java.setLinearGradient(a, 0.7940693f, 0.8090447f, 0.08431214f, 0.07970222f, new int[]{-4679064, -2112619}, new float[]{0.0f, 1.0f}, h, 0);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
