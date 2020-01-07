package com.example.meeting2020.entity;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.meeting2020.util.ToastUtil;

public class BaseBean {

    public String Name;
    public int Id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return Name;
    }

    public void showToast(Context context, String msg) {
        ToastUtil.showMsg(context,msg );
    }
}
