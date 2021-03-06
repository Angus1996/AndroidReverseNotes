package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ErrorDialogFragment extends DialogFragment {
    private Dialog mDialog = null;
    private OnCancelListener zzap = null;

    public static ErrorDialogFragment newInstance(Dialog dialog) {
        AppMethodBeat.m2504i(60412);
        ErrorDialogFragment newInstance = newInstance(dialog, null);
        AppMethodBeat.m2505o(60412);
        return newInstance;
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, OnCancelListener onCancelListener) {
        AppMethodBeat.m2504i(60413);
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.mDialog = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.zzap = onCancelListener;
        }
        AppMethodBeat.m2505o(60413);
        return errorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        AppMethodBeat.m2504i(60411);
        if (this.zzap != null) {
            this.zzap.onCancel(dialogInterface);
        }
        AppMethodBeat.m2505o(60411);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        AppMethodBeat.m2504i(60410);
        if (this.mDialog == null) {
            setShowsDialog(false);
        }
        Dialog dialog = this.mDialog;
        AppMethodBeat.m2505o(60410);
        return dialog;
    }

    public void show(FragmentManager fragmentManager, String str) {
        AppMethodBeat.m2504i(60414);
        super.show(fragmentManager, str);
        AppMethodBeat.m2505o(60414);
    }
}
