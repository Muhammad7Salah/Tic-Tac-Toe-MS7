package com.example.ziko_.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cell00,cell01,cell02,cell10,cell11,cell12,cell20,cell21,cell22;
    Boolean switchUser=false;
    String[][] board = new String[3][3];
    CheckBox[] cells=new CheckBox[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize cells
        cell00=(CheckBox)findViewById(R.id.cell00);cell01=(CheckBox)findViewById(R.id.cell01);cell02=(CheckBox)findViewById(R.id.cell02);cell10=(CheckBox)findViewById(R.id.cell10);cell11=(CheckBox)findViewById(R.id.cell11);cell12=(CheckBox)findViewById(R.id.cell12);cell20=(CheckBox)findViewById(R.id.cell20);cell21=(CheckBox)findViewById(R.id.cell21);cell22=(CheckBox)findViewById(R.id.cell22);

        cells[0]=cell00;cells[1]=cell01;cells[2]=cell02;cells[3]=cell10;cells[4]=cell11;cells[5]=cell12;cells[6]=cell20;cells[7]=cell21;cells[8]=cell22;

        cell00.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked)
                    cell00.setEnabled(false);
                switchUser ^= true;
                if (!switchUser)// if o
                {
                    cell00.setButtonDrawable(R.drawable.ocell);
                    board[0][0] = "O";
                } else {
                    cell00.setButtonDrawable(R.drawable.xcell);
                    board[0][0] = "X";

                }
                if(checkWinner(board)=="X"){
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);

                    Toast.makeText(MainActivity.this, "X the is winner", Toast.LENGTH_SHORT).show();
                }
                else if(checkWinner(board)=="O"){
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "O is the winner", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cell01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                    cell01.setEnabled(false);
                switchUser ^= true;
                if (!switchUser)// if o
                {
                    cell01.setButtonDrawable(R.drawable.ocell);
                    board[0][1] = "O";
                } else {
                    cell01.setButtonDrawable(R.drawable.xcell);
                    board[0][1] = "X";
                }

                if(checkWinner(board)=="X") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "X the is winner", Toast.LENGTH_SHORT).show();
                }
                else if(checkWinner(board)=="O") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "O is the winner", Toast.LENGTH_SHORT).show();
                    }
                }
        });

        cell02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                    cell02.setEnabled(false);
                switchUser ^= true;
                if (!switchUser)// if o
                {
                    cell02.setButtonDrawable(R.drawable.ocell);
                    board[0][2] = "O";
                } else {
                    cell02.setButtonDrawable(R.drawable.xcell);
                    board[0][2] = "X";

                }

                if(checkWinner(board)=="X") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "X the is winner", Toast.LENGTH_SHORT).show();
                }
                else if(checkWinner(board)=="O") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "O is the winner", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cell10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                    cell10.setEnabled(false);
                switchUser ^= true;
                if (!switchUser)// if o
                {
                    cell10.setButtonDrawable(R.drawable.ocell);
                    board[1][0] = "O";
                } else {
                    cell10.setButtonDrawable(R.drawable.xcell);
                    board[1][0] = "X";

                }

                if(checkWinner(board)=="X") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "X the is winner", Toast.LENGTH_SHORT).show();
                }
                else if(checkWinner(board)=="O") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "O is the winner", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cell11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                    cell11.setEnabled(false);
                switchUser ^= true;
                if (!switchUser)// if o
                {
                    cell11.setButtonDrawable(R.drawable.ocell);
                    board[1][1] = "O";
                } else {
                    cell11.setButtonDrawable(R.drawable.xcell);
                    board[1][1] = "X";

                }
                if(checkWinner(board)=="X") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "X the is winner", Toast.LENGTH_SHORT).show();
                }
                else if(checkWinner(board)=="O") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "O is the winner", Toast.LENGTH_SHORT).show();
                }
}
        });

        cell12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                    cell12.setEnabled(false);
                switchUser ^= true;
                if (!switchUser)// if o
                {
                    cell12.setButtonDrawable(R.drawable.ocell);
                    board[1][2] = "O";
                } else {
                    cell12.setButtonDrawable(R.drawable.xcell);
                    board[1][2] = "X";
                }

                if(checkWinner(board)=="X") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "X the is winner", Toast.LENGTH_SHORT).show();
                }
                else if(checkWinner(board)=="O") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "O is the winner", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cell20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                    cell20.setEnabled(false);
                switchUser ^= true;
                if (!switchUser)// if o
                {
                    cell20.setButtonDrawable(R.drawable.ocell);
                    board[2][0] = "O";
                } else {
                    cell20.setButtonDrawable(R.drawable.xcell);
                    board[2][0] = "X";

                }
                if(checkWinner(board)=="X") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "X the is winner", Toast.LENGTH_SHORT).show();
                }
                else if(checkWinner(board)=="O") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "O is the winner", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cell21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                    cell21.setEnabled(false);
                switchUser ^= true;
                if (!switchUser)// if o
                {
                    cell21.setButtonDrawable(R.drawable.ocell);
                    board[2][1] = "O";
                } else {
                    cell21.setButtonDrawable(R.drawable.xcell);
                    board[2][1] = "X";

                }

                if(checkWinner(board)=="X") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "X the is winner", Toast.LENGTH_SHORT).show();
                }
                else if(checkWinner(board)=="O") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "O is the winner", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cell22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked)
                    cell22.setEnabled(false);
                switchUser ^= true;
                if (!switchUser)// if o
                {
                    cell22.setButtonDrawable(R.drawable.ocell);
                    board[2][2] = "O";
                } else {
                    cell22.setButtonDrawable(R.drawable.xcell);
                    board[2][2] = "X";

                }

                if(checkWinner(board)=="X") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "X the is winner", Toast.LENGTH_SHORT).show();
                }
                else if(checkWinner(board)=="O") {
                    for (CheckBox cb: cells)
                        cb.setEnabled(false);
                    Toast.makeText(MainActivity.this, "O is the winner", Toast.LENGTH_SHORT).show();
                }
            }
        });

 /*       CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cell, boolean isChecked) {
                switch(cell.getId())
                {
                    case R.id.cell00:
                        if(cell00.isChecked())
                            cell00.setEnabled(false);
                    case R.id.cell01:
                        if(isChecked)
                            cell.setEnabled(false);
                    case R.id.cell02:
                        if(isChecked)
                            cell.setEnabled(false);
                    case R.id.cell10:
                        if(isChecked)
                            cell.setEnabled(false);
                    case R.id.cell11:
                        if(isChecked)
                            cell.setEnabled(false);
                    case R.id.cell12:
                        if(isChecked)
                            cell.setEnabled(false);
                    case R.id.cell20:
                        if(isChecked)
                            cell.setEnabled(false);
                    case R.id.cell21:
                        if(cell.isChecked())
                            cell.setEnabled(false);
                    case R.id.cell22:
                        if(cell22.isChecked())
                            cell.setEnabled(false);

                }
            }
        };
*/

    }

    public String checkWinner(String[][] board){
        if(board[0][0]==board[0][1] && board[0][1]==board[0][2] && board[0][0]!=null)    //first row
            return board[0][0];
        else if(board[1][0]==board[1][1] && board[1][1]==board[1][2] && board[1][0]!=null)   //second row
            return board[1][0];
        else if(board[2][0]==board[2][1] && board[2][1]==board[2][2] && board[2][0]!=null)   //third row
            return board[2][0];
        else if(board[0][0]==board[1][0] && board[1][0]==board[2][0] && board[0][0]!=null)   //first column
            return board[0][0];
        else if(board[0][1]==board[1][1] && board[1][1]==board[2][1] && board[0][1]!=null)   //second column
            return board[0][1];
        else if(board[0][2]==board[1][2] && board[1][2]==board[2][2] && board[0][2]!=null)   //third column
            return board[0][2];
        else if(board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!=null)   //main diagonal
            return board[0][0];
        else if(board[0][2]==board[1][1] && board[1][1]==board[2][0] && board[0][2]!=null)   //off diagonal
            return board[0][2];
        else
            return null;
    }


}
