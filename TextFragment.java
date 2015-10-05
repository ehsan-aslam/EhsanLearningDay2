package putitout.ehsanlearningday2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SA on 10/2/2015.
 */
public class TextFragment extends android.support.v4.app.Fragment  {
    TextView mTextNames,mTextVersions;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.textformat, container, false);
        mTextNames= (TextView) view.findViewById(R.id.AndroidOs);
        mTextVersions= (TextView)view.findViewById(R.id.Version);


        return view;

    }
    public void change(String mTxtName, String mTxtVersion){
        mTextNames.setText(mTxtName);
        mTextVersions.setText(mTxtVersion);

    }
}
