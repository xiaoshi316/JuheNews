package jzfp.gs.com.juhenews.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import jzfp.gs.com.juhenews.R;

/**
 * Created by lisa on 2016/12/9.
 * Email: 457420045@qq.com
 */

public class SettingsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context = null;
    private String[] options = null;
    private SharedPreferences sp = null;

    public SettingsAdapter(Context context, String[] options) {
        this.context = context;
        this.options = options;
        this.sp = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.settings_item_text, null, false);
        return new ViewHolderText(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolderText) {
            ViewHolderText viewHolderText = (ViewHolderText) holder;
            viewHolderText.tvTitle.setText(options[position]);

            viewHolderText.tvContent.setText(sp.getString(options[position], null));
        }
        final int local = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText editText = new EditText(context);
                editText.setText(sp.getString(options[local], null));
                editText.setHint("请输入" + options[local]);
                AlertDialog.Builder builder = new AlertDialog.Builder(context)
                        .setTitle(options[local])
                        .setView(editText)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = sp.edit();
                                editor.putString(options[local], editText.getText().toString());
                                editor.apply();
                                notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if (options != null && options.length > 0) {
            return options.length;
        }
        return 0;
    }


    class ViewHolderText extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_settings_title)
        public TextView tvTitle;
        @BindView(R.id.tv_settings_content)
        public TextView tvContent;

        public ViewHolderText(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
