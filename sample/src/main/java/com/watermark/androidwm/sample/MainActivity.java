/*
 *    Copyright 2018 huangyz0918
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package com.watermark.androidwm.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bumptech.glide.Glide;
import com.watermark.androidwm.WatermarkBuilder;

/**
 * This is the sample for library: androidwm.
 *
 * @author huangyz0918 (huangyz0918@gmail.com)
 * @since 29/08/2018
 */
public class MainActivity extends AppCompatActivity {

    private Button btnAddText;
    private Button btnAddImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initEvents();
    }

    private void initViews() {
        btnAddImg = findViewById(R.id.btn_add_image);
        btnAddText = findViewById(R.id.btn_add_text);

        // init library
//        Glide.with();
//        WatermarkBuilder.getInstance()
    }

    private void initEvents() {

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnAddImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
