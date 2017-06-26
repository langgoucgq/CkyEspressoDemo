package com.example.kyoungcai.espressodemo.login;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kyoungcai.espressodemo.MainActivity;
import com.example.kyoungcai.espressodemo.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment implements IView{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    private Button btn;
    private EditText ed_uname,ed_pwd;
    private LoginPresenter loginPresenter;
    private String uname,pwd;


    public LoginFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginFragment newInstance(String param1, String param2) {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        initView(view);
        initListener();
        return view;
    }

    private void initListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname=ed_uname.getText().toString();
                pwd=ed_pwd.getText().toString();

                //把获得的信息传入p层
                loginPresenter.login(uname,pwd);
            }
        });
    }

    private void initView(View view) {
        btn= (Button) view.findViewById(R.id.btn);
        ed_uname= (EditText) view.findViewById(R.id.ed_uname);
        ed_pwd= (EditText) view.findViewById(R.id.ed_pwd);
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     *
     */
    @Override
    public void login() {

        Toast.makeText(getActivity(),"请等待,正在登录",Toast.LENGTH_LONG).show();
    }

    @Override
    public void setPresenter(LoginPresenter loginPresenter) {
        this.loginPresenter=loginPresenter;
    }

    @Override
    public void gotoMain() {
        Intent intent=new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void showMessage() {

        Toast.makeText(getActivity(),"用户名或密码错误",Toast.LENGTH_LONG).show();
    }




}
