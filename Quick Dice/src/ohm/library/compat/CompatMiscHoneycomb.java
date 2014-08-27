package ohm.library.compat;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;

/**
 * Derived class to be used with {@link Build.VERSION_CODES.HONEYCOMB} (API 11).
 * @author Ohmnibus
 */
@SuppressWarnings("deprecation")
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class CompatMiscHoneycomb extends CompatMisc {

	@Override
	public void setBackgroundDrawable(View v, Drawable d) {
		v.setBackgroundDrawable(d);
	}

	@Override
	public void setInputTypeNoKeyboard(EditText editText) {
		editText.setInputType(InputType.TYPE_NULL);

		editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
		editText.setTextIsSelectable(true);
	}
	
	@Override
	protected int getLayoutMatchParent() {
		return LayoutParams.MATCH_PARENT;
	}

	@Override
	protected int getLayoutWrapContent() {
		return LayoutParams.WRAP_CONTENT;
	}

}
