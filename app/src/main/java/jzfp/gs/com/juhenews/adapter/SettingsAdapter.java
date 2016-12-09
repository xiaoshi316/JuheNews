package jzfp.gs.com.juhenews.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.preference.PreferenceManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;
import jzfp.gs.com.juhenews.R;

/**
 * Created by lisa on 2016/12/9.
 */

public class SettingsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final  int ITEM_TYPE_IMAGE = 0;
    private static final  int ITEM_TYPE_TEXT = 1;
    private Context context = null;
    private String[] options = null;
    private SharedPreferences sp = null;

    public SettingsAdapter(Context context, String[] options) {
        this.context = context;
        this.options = options;
        this.sp= PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if(viewType == ITEM_TYPE_IMAGE) {
            view = LayoutInflater.from(context).inflate(R.layout.settings_item_image, null, false);
            ViewHolderImage viewHolderImage = new ViewHolderImage(view);
            return viewHolderImage;
        } else if(viewType == ITEM_TYPE_TEXT) {
            view = LayoutInflater.from(context).inflate(R.layout.settings_item_text, null, false);
            ViewHolderText viewHolderText = new ViewHolderText(view);
            return viewHolderText;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if(holder instanceof ViewHolderImage) {
            ViewHolderImage viewHolderImage = (ViewHolderImage)holder;
            viewHolderImage.tvTitle.setText(options[position]);
            viewHolderImage.civContent.setImageBitmap(null);
        } else if(holder instanceof  ViewHolderText) {
            ViewHolderText viewHolderText = (ViewHolderText)holder;
            viewHolderText.tvTitle.setText(options[position]);

            viewHolderText.tvContent.setText(sp.getString(options[position], null));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText editText = new EditText(context);
                editText.setText(sp.getString(options[position], null));
                editText.setHint("请输入" + options[position]);
                AlertDialog.Builder builder = new AlertDialog.Builder(context)
                        .setTitle(options[position])
                        .setView(editText)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                SharedPreferences.Editor editor = sp.edit();
                                editor.putString(options[position], editText.getText().toString());
                                editor.commit();
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
        if(options!= null && options.length >0){
            System.err.println("yidong -- length = " + options.length);
            return options.length;
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
//        if(position==0) return ITEM_TYPE_IMAGE;
//        else
          return ITEM_TYPE_TEXT;
    }

    class ViewHolderImage extends RecyclerView.ViewHolder {
        TextView tvTitle;
        CircleImageView civContent;
        public ViewHolderImage(View itemView) {
            super(itemView);
            tvTitle = (TextView)itemView.findViewById(R.id.tv_settings_title);
            civContent = (CircleImageView) itemView.findViewById(R.id.civ_settings_content);
        }
    }

    class ViewHolderText extends RecyclerView.ViewHolder {
        TextView tvTitle, tvContent;
        public ViewHolderText(View itemView) {
            super(itemView);
            tvTitle = (TextView)itemView.findViewById(R.id.tv_settings_title);
            tvContent = (TextView)itemView.findViewById(R.id.tv_settings_content);
        }
    }
}
