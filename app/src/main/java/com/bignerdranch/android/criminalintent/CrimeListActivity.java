package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by 阳阳 on 2017/2/28.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
