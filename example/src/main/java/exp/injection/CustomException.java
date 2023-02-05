package exp.injection;

import android.util.Log;

import java.io.File;
import java.util.List;

public class CustomException {
    public static final String TAG = CustomException.class.getSimpleName();

    public static boolean injectZeroLogicError (long countDownInterval){
        try {
            Log.i(TAG,"injectZeroLogicError begin");
            return false;
        } finally {
            Log.i(TAG,"injectZeroLogicError after");
        }
    }
}
