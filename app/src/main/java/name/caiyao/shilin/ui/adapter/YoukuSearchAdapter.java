package name.caiyao.shilin.ui.adapter;

import android.app.SearchManager;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 蔡尧 on 2015/12/28 0028.
 */
public class YoukuSearchAdapter extends CursorAdapter {
    public YoukuSearchAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView textView = (TextView) view;
        int textIndex = cursor.getColumnIndex(SearchManager.SUGGEST_COLUMN_TEXT_1);
        textView.setText(cursor.getString(textIndex));
    }
}
