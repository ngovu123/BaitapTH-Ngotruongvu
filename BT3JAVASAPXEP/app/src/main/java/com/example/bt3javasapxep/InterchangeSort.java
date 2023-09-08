package com.example.bt3javasapxep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class InterchangeSort extends AppCompatActivity {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}