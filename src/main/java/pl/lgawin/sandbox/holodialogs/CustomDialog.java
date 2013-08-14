package pl.lgawin.sandbox.holodialogs;


import android.support.v4.app.FragmentActivity;
import android.widget.ArrayAdapter;

import eu.inmite.android.lib.dialogs.BaseDialogFragment;

/**
 * Created by gawcio on 14.08.2013.
 */
public class CustomDialog extends BaseDialogFragment{
    private static final String TAG = "custom-dialog";

    @Override
    protected Builder build(Builder builder) {
        builder.setTitle("Dialog fragment");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getItems());
        builder.setItems(adapter, -1, null);
        builder.setPositiveButton("OK", null);
        return builder;
    }

    private String[] getItems() {
        return new String[] { "Item 1", "Item 2", "Item 3"};
    }

    public static void show(FragmentActivity activity) {
        CustomDialog dialog = new CustomDialog();
        dialog.show(activity.getSupportFragmentManager(), TAG);
    }
}
