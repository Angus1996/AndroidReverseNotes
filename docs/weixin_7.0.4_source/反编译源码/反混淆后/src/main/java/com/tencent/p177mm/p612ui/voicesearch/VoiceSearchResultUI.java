package com.tencent.p177mm.p612ui.voicesearch;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.C25738R;
import com.tencent.p177mm.model.C1853r;
import com.tencent.p177mm.model.C1854s;
import com.tencent.p177mm.model.C1855t;
import com.tencent.p177mm.model.C9638aw;
import com.tencent.p177mm.p612ui.MMActivity;
import com.tencent.p177mm.p612ui.MMAppMgr;
import com.tencent.p177mm.p612ui.chatting.ChattingUI;
import com.tencent.p177mm.p612ui.contact.C36249e;
import com.tencent.p177mm.p842bp.C25985d;
import com.tencent.p177mm.plugin.report.service.C7060h;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import com.tencent.p177mm.sdk.platformtools.C5046bo;
import com.tencent.p177mm.storage.C7616ad;
import com.tencent.wcdb.database.SQLiteGlobal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.voicesearch.VoiceSearchResultUI */
public class VoiceSearchResultUI extends MMActivity {
    private int cKB = 2;
    private TextView kxK;
    private int lRx = -1;
    int showType = 1;
    private C46939b zLE;
    private String[] zLF;
    private boolean zLG = false;
    boolean zLH = false;
    private ListView zLr;
    private String zLt = null;

    /* renamed from: com.tencent.mm.ui.voicesearch.VoiceSearchResultUI$1 */
    class C159801 implements OnMenuItemClickListener {
        C159801() {
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            AppMethodBeat.m2504i(35369);
            if (!VoiceSearchResultUI.this.zLG) {
                C7060h.pYm.mo8374X(10452, VoiceSearchResultUI.this.cKB + "," + VoiceSearchResultUI.this.lRx + "," + (VoiceSearchResultUI.this.zLF == null ? 0 : VoiceSearchResultUI.this.zLF.length) + ",0");
            }
            if (VoiceSearchResultUI.this.zLH) {
                VoiceSearchResultUI.this.moveTaskToBack(true);
            }
            VoiceSearchResultUI.this.finish();
            AppMethodBeat.m2505o(35369);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.voicesearch.VoiceSearchResultUI$2 */
    class C159812 implements OnItemClickListener {
        C159812() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AppMethodBeat.m2504i(35370);
            if (!VoiceSearchResultUI.this.zLG) {
                int i2;
                C7060h c7060h = C7060h.pYm;
                StringBuilder append = new StringBuilder().append(VoiceSearchResultUI.this.cKB).append(",").append(VoiceSearchResultUI.this.lRx).append(",");
                if (VoiceSearchResultUI.this.zLF == null) {
                    i2 = 0;
                } else {
                    i2 = VoiceSearchResultUI.this.zLF.length;
                }
                c7060h.mo8374X(10452, append.append(i2).append(",").append(i).toString());
            }
            C7616ad PP = VoiceSearchResultUI.this.zLE.mo76188PP(i);
            Context context = VoiceSearchResultUI.this;
            String str = PP.field_username;
            String Oj = PP.mo16707Oj();
            if (str == null || str.length() <= 0) {
                AppMethodBeat.m2505o(35370);
                return;
            }
            C4990ab.m7410d("MicroMsg.VoiceSearchResultUI", "dealSelectContact ".concat(String.valueOf(str)));
            Intent intent;
            if (context.showType == 3) {
                intent = new Intent();
                intent.putExtra("Select_Conv_User", str);
                context.setResult(-1, intent);
                context.finish();
                AppMethodBeat.m2505o(35370);
                return;
            }
            if (context.showType != 1 && !C1855t.m3924nJ(str) && !C1855t.m3913mZ(str) && !C1855t.m3896kH(str) && !C1855t.m3910mW(str) && !VoiceSearchResultUI.asA(Oj)) {
                Intent intent2 = new Intent(context, SearchConversationResultUI.class);
                intent2.putExtra("SearchConversationResult_User", Oj);
                context.startActivity(intent2);
            } else if (context.showType == 1) {
                intent = new Intent();
                intent.putExtra("Contact_User", str);
                if (C1855t.m3910mW(str)) {
                    intent.putExtra("Is_group_card", true);
                }
                if (str != null && str.length() > 0) {
                    C36249e.m59677a(intent, str);
                    if (context.zLH) {
                        context.mo17381a(ChattingUI.class, new Intent().putExtra("Chat_User", str).putExtra("finish_direct", true));
                        context.finish();
                        AppMethodBeat.m2505o(35370);
                        return;
                    }
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent);
                }
                AppMethodBeat.m2505o(35370);
                return;
            } else if (context.showType == 2) {
                if (C5046bo.isNullOrNil(str)) {
                    C4990ab.m7412e("MicroMsg.VoiceSearchResultUI", "username is null ".concat(String.valueOf(str)));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3936ne(str)) {
                    if (C1853r.m3837YS()) {
                        C25985d.m41467b(context.mController.ylL, "tmessage", ".ui.TConversationUI", new Intent().putExtra("finish_direct", true));
                        AppMethodBeat.m2505o(35370);
                        return;
                    }
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3938ng(str)) {
                    if (C1853r.m3834YP()) {
                        C25985d.m41467b(context.mController.ylL, "qmessage", ".ui.QConversationUI", new Intent().putExtra("finish_direct", true));
                        AppMethodBeat.m2505o(35370);
                        return;
                    }
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3937nf(str)) {
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3942nk(str)) {
                    MMAppMgr.cancelNotification(str);
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3934nc(str)) {
                    if (C1853r.m3848Zb()) {
                        context.mo17381a(ChattingUI.class, new Intent().putExtra("Chat_User", str).putExtra("finish_direct", true));
                        AppMethodBeat.m2505o(35370);
                        return;
                    }
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3947np(str)) {
                    if (C1853r.m3840YV()) {
                        intent = new Intent();
                        intent.putExtra("type", 20);
                        C25985d.m41467b(context, "readerapp", ".ui.ReaderAppUI", intent);
                        AppMethodBeat.m2505o(35370);
                        return;
                    }
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3955nx(str)) {
                    if (C1853r.m3841YW()) {
                        intent = new Intent();
                        intent.putExtra("type", 11);
                        C25985d.m41467b(context, "readerapp", ".ui.ReaderAppUI", intent);
                        AppMethodBeat.m2505o(35370);
                        return;
                    }
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3939nh(str)) {
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3940ni(str)) {
                    if (C1853r.m3843YY()) {
                        C25985d.m41467b(context, "masssend", ".ui.MassSendHistoryUI", new Intent().putExtra("finish_direct", true));
                        AppMethodBeat.m2505o(35370);
                        return;
                    }
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3946no(str)) {
                    if (C1853r.m3838YT()) {
                        context.mo17381a(ChattingUI.class, new Intent().putExtra("Chat_User", str).putExtra("finish_direct", true));
                        AppMethodBeat.m2505o(35370);
                        return;
                    }
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else if (C1855t.m3944nm(str) || C1855t.m3945nn(str) || C1855t.m3941nj(str) || C1855t.m3949nr(str) || C1855t.m3950ns(str) || C1855t.m3935nd(str) || C1855t.m3915nA(str)) {
                    C25985d.m41467b(context, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", str));
                    AppMethodBeat.m2505o(35370);
                    return;
                } else {
                    context.mo17381a(ChattingUI.class, new Intent().putExtra("Chat_User", str).putExtra("finish_direct", true));
                    AppMethodBeat.m2505o(35370);
                    return;
                }
            }
            AppMethodBeat.m2505o(35370);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        AppMethodBeat.m2503at(this, z);
    }

    public void onCreate(Bundle bundle) {
        AppMethodBeat.m2504i(35371);
        super.onCreate(bundle);
        initView();
        this.zLG = false;
        AppMethodBeat.m2505o(35371);
    }

    public final void initView() {
        AppMethodBeat.m2504i(35372);
        this.zLr = (ListView) findViewById(2131828473);
        this.kxK = (TextView) findViewById(2131821055);
        this.zLF = getIntent().getStringArrayExtra("VoiceSearchResultUI_Resultlist");
        this.zLt = getIntent().getStringExtra("VoiceSearchResultUI_Error");
        this.lRx = getIntent().getIntExtra("VoiceSearchResultUI_VoiceId", -1);
        this.showType = getIntent().getIntExtra("VoiceSearchResultUI_ShowType", 1);
        this.cKB = this.showType == 1 ? 2 : 1;
        this.zLH = getIntent().getBooleanExtra("VoiceSearchResultUI_IsVoiceControl", false);
        C4990ab.m7417i("MicroMsg.VoiceSearchResultUI", "showType = %s, isVoiceControl = %s", Integer.valueOf(this.showType), Boolean.valueOf(this.zLH));
        this.zLE = new C46939b(getApplicationContext(), this.showType);
        this.zLE.mo76203qV(false);
        dHz();
        this.zLr.setAdapter(this.zLE);
        this.kxK.setVisibility(8);
        C4990ab.m7410d("MicroMsg.VoiceSearchResultUI", "voiceId  " + this.lRx);
        if (this.showType == 2) {
            setMMTitle("");
            this.zLF = VoiceSearchResultUI.m24283U(this.zLF);
        } else {
            setMMTitle(getString(C25738R.string.f37));
        }
        setMMTitle(getString(C25738R.string.f37));
        setBackBtn(new C159801());
        this.zLr.setOnItemClickListener(new C159812());
        m24284V(this.zLF);
        AppMethodBeat.m2505o(35372);
    }

    /* renamed from: U */
    private static String[] m24283U(String[] strArr) {
        AppMethodBeat.m2504i(35373);
        if (strArr == null || strArr.length == 0) {
            AppMethodBeat.m2505o(35373);
            return strArr;
        }
        C4990ab.m7410d("MicroMsg.VoiceSearchResultUI", "oldlist.length " + strArr.length);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String mJ = C1854s.m3866mJ(str);
            C4990ab.m7410d("MicroMsg.VoiceSearchResultUI", "displayname ".concat(String.valueOf(mJ)));
            if (!hashMap.containsValue(mJ) || !C1855t.m3896kH(str)) {
                C4990ab.m7410d("MicroMsg.VoiceSearchResultUI", "username ".concat(String.valueOf(str)));
                hashMap.put(mJ, str);
                arrayList.add(str);
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        AppMethodBeat.m2505o(35373);
        return strArr2;
    }

    public void onDestroy() {
        AppMethodBeat.m2504i(35374);
        super.onDestroy();
        this.zLE.bIf();
        AppMethodBeat.m2505o(35374);
    }

    public void onPause() {
        AppMethodBeat.m2504i(35375);
        super.onPause();
        this.zLG = true;
        AppMethodBeat.m2505o(35375);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AppMethodBeat.m2504i(35376);
        if (4 == i) {
            if (!this.zLG) {
                C7060h.pYm.mo8374X(10452, this.cKB + "," + this.lRx + "," + (this.zLF == null ? 0 : this.zLF.length) + ",0");
            }
            if (this.zLH) {
                moveTaskToBack(true);
                finish();
                AppMethodBeat.m2505o(35376);
                return true;
            }
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        AppMethodBeat.m2505o(35376);
        return onKeyDown;
    }

    static boolean asA(String str) {
        AppMethodBeat.m2504i(35377);
        Cursor[] cursorArr = new Cursor[2];
        cursorArr[0] = C9638aw.m17190ZK().fkd.mo44190b(C1855t.fkP, null, str);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        while (cursorArr[0].moveToNext()) {
            try {
                String string = cursorArr[0].getString(cursorArr[0].getColumnIndex("username"));
                arrayList.add(string);
                if (!C1855t.m3896kH(string)) {
                    arrayList2.add(string);
                }
                C4990ab.m7410d("MicroMsg.VoiceSearchResultUI", "block user ".concat(String.valueOf(string)));
            } catch (Exception e) {
                C4990ab.printErrStackTrace("MicroMsg.VoiceSearchResultUI", e, "", new Object[0]);
            }
        }
        cursorArr[1] = C9638aw.m17190ZK().fke.mo20973a(str, "@micromsg.with.all.biz.qq.com", arrayList, arrayList2);
        int count = cursorArr[1].getCount();
        int count2 = cursorArr[0].getCount();
        cursorArr[0].close();
        cursorArr[1].close();
        C4990ab.m7410d("MicroMsg.VoiceSearchResultUI", "contactCount " + count + " conversationCount " + count2);
        if (count + count2 <= 1) {
            AppMethodBeat.m2505o(35377);
            return true;
        }
        AppMethodBeat.m2505o(35377);
        return false;
    }

    /* renamed from: V */
    private void m24284V(String[] strArr) {
        AppMethodBeat.m2504i(35378);
        ArrayList arrayList = new ArrayList();
        if (!(strArr == null || this.zLE == null)) {
            for (String str : strArr) {
                if (this.zLE.asz(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.size() == 0) {
            this.kxK.setVisibility(0);
            if (this.zLt != null) {
                this.kxK.setText(this.zLt);
            } else {
                this.kxK.setText(getString(C25738R.string.f8750dy));
            }
        } else {
            this.kxK.setVisibility(8);
        }
        if (this.zLE != null) {
            C46939b c46939b = this.zLE;
            c46939b.yDL = (String[]) arrayList.toArray(new String[arrayList.size()]);
            c46939b.sfv = null;
            c46939b.bIf();
            c46939b.mo76199ll(false);
        }
        AppMethodBeat.m2505o(35378);
    }

    public final int getLayoutId() {
        return 2130971023;
    }

    private void dHz() {
        AppMethodBeat.m2504i(35379);
        LinkedList linkedList = new LinkedList();
        switch (this.showType) {
            case 2:
                linkedList.add("lbsapp");
                linkedList.add("shakeapp");
                linkedList.add("qqfriend");
                linkedList.add("facebookapp");
                linkedList.add("feedsapp");
                linkedList.add("fmessage");
                linkedList.add("voipapp");
                linkedList.add("voicevoipapp");
                linkedList.add("voiceinputapp");
                linkedList.add("linkedinplugin");
                linkedList.add("notifymessage");
                int YK = C1853r.m3829YK();
                if ((YK & 1) != 0) {
                    linkedList.add("qqmail");
                }
                if (!(C1855t.m3875Zl() && (YK & 2) == 0)) {
                    linkedList.add("tmessage");
                }
                if ((YK & 32) != 0) {
                    linkedList.add("qmessage");
                }
                if ((YK & 128) != 0) {
                    linkedList.add("qqsync");
                }
                if ((YK & 16) != 0) {
                    linkedList.add("medianote");
                }
                if ((SQLiteGlobal.journalSizeLimit & YK) != 0) {
                    linkedList.add("newsapp");
                }
                if (!((262144 & YK) == 0 && C1855t.m3874Zk())) {
                    linkedList.add("blogapp");
                }
                if ((YK & 65536) != 0) {
                    linkedList.add("masssendapp");
                }
                linkedList.add("voiceinputapp");
                break;
        }
        if (this.zLE != null) {
            this.zLE.mo76194fl(linkedList);
        }
        AppMethodBeat.m2505o(35379);
    }
}
