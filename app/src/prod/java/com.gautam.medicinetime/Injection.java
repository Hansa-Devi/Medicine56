package com.hansa56.medicinetime;

import android.content.Context;
import androidx.annotation.NonNull;


import com.hansa56.medicinetime.data.source.MedicineRepository;
import com.hansa56.medicinetime.data.source.local.MedicinesLocalDataSource;


/**
 * Created by gautam on 13/05/17.
 */

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}