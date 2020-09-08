package com.hansa56.medicinetime.alarm;

import com.hansa56.medicinetime.BasePresenter;
import com.hansa56.medicinetime.BaseView;
import com.hansa56.medicinetime.data.source.History;
import com.hansa56.medicinetime.data.source.MedicineAlarm;


public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
