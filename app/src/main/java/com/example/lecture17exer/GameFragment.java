package com.example.lecture17exer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lecture17exer.databinding.FragmentGameBinding;

public class GameFragment extends Fragment {
    private FragmentGameBinding binding;
    int numLettersGuessedCorrectly = 0;
    int numTriesWrong = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentGameBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        TextView firstLetter = binding.firstLetter;
        TextView secondLetter = binding.firstLetter;
        TextView thirdLetter = binding.firstLetter;
        TextView fourthLetter = binding.firstLetter;

        EditText guessLetterText = binding.enterLetter;

        //String message =

        firstLetter.setVisibility(View.INVISIBLE);
        secondLetter.setVisibility(View.INVISIBLE);
        thirdLetter.setVisibility(View.INVISIBLE);
        fourthLetter.setVisibility(View.INVISIBLE);

        binding.gameFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstLetter = binding.firstLetter.getText().toString();
                String secondLetter = binding.secondLetter.getText().toString();
                String thirdLetter = binding.thirdLetter.getText().toString();
                String fourthLetter = binding.fourthLetter.getText().toString();

                String textFromEditText = guessLetterText.getText().toString();

                //System.out.println(numLettersGuessedCorrectly);

                String word = "golf";

                NavDirections action = GameFragmentDirections.actionGameFragmentToResultFragment(word);
                Navigation.findNavController(view).navigate(action);

                if(textFromEditText.equals("g")){
                    numLettersGuessedCorrectly++;
                    if(numLettersGuessedCorrectly == 4){
                        Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_resultFragment);
                    }
                }

                else if (textFromEditText.equals("o")){
                    numLettersGuessedCorrectly++;
                    if(numLettersGuessedCorrectly == 4){
                        Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_resultFragment);
                    }
                }

                else if (textFromEditText.equals("l")){
                    numLettersGuessedCorrectly++;
                    if(numLettersGuessedCorrectly == 4){
                        Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_resultFragment);
                    }
                }

                else if (textFromEditText.equals("f")) {
                    numLettersGuessedCorrectly++;
                    if (numLettersGuessedCorrectly == 4) {
                        Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_resultFragment);
                    }
                }

                else{
                    numTriesWrong++;
                    if(numTriesWrong == 4){
                        Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_resultFragment);
                    }
                }

            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}