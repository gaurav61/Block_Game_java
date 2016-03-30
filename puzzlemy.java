package awt_swing;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class puzzlemy implements ActionListener {
  JFrame f;
  static int count=0,flag=0;
  JTextField tf,tf2;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next,pa;
  puzzlemy(){
	  f=new JFrame("The Game");
	  
	  b1=new JButton("6");
	  b2=new JButton("");
	  b3=new JButton("7");
	  b4=new JButton("4");
	  b5=new JButton("1");
	  b6=new JButton("3");
	  b7=new JButton("2");
	  b8=new JButton("5");
	  b9=new JButton("8");
	  next=new JButton("retry");
	  pa=new JButton("play again");
	  next.setBackground(Color.black);
	  next.setForeground(Color.blue);
	  pa.setBackground(Color.black);
	  pa.setForeground(Color.blue);
	  tf=new JTextField();
	  tf2=new JTextField();
	  b1.setBounds(50, 60, 60, 40);
	  b2.setBounds(110, 60, 60, 40);
	  b3.setBounds(170, 60, 60, 40);
	  b4.setBounds(50, 100, 60, 40);
	  b5.setBounds(110, 100, 60, 40);
	  b6.setBounds(170, 100, 60, 40);
	  b7.setBounds(50, 140, 60, 40);
	  b8.setBounds(110, 140, 60, 40);
	  b9.setBounds(170, 140, 60, 40);
	  next.setBounds(25, 230, 80, 40);
	  pa.setBounds(140, 230, 150, 40);
	  tf2.setBounds(130, 20, 120, 30);
	  tf.setBounds(50, 20, 60, 30);
	  f.add(b1);
	  f.add(b2);
	  f.add(b3);
	  f.add(b4);
	  f.add(b5);
	  f.add(b6);
	  f.add(b7);
	  f.add(b8);
	  f.add(b9);
	  f.add(tf);
	  f.add(tf2);
	  f.add(next);
	  f.add(pa);
	  tf.setText("0");
	  tf2.setText("");
	  f.setSize(350, 350);
	  f.setLayout(null);
	  f.setVisible(true);
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  b3.addActionListener(this);
	  b4.addActionListener(this);
	  b5.addActionListener(this);
	  b6.addActionListener(this);
	  b7.addActionListener(this);
	  b8.addActionListener(this);
	  b9.addActionListener(this);
	  pa.addActionListener(this);
	  next.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
	 // String s;
	  if(e.getSource()==b1&&flag==0){
		  if(b2.getText()==""){
		//	  s=b1.getText();
			  b2.setText(b1.getText());
			  b1.setText("");
			  count++;
			  tf.setText(""+count);
		  }
		  if(b4.getText()==""){
				//	  s=b1.getText();
					  b4.setText(b1.getText());
					  b1.setText("");
					  count++;
					  tf.setText(""+count);
				  }
	  }
	  if(e.getSource()==b2&&flag==0){
		  if(b1.getText()==""){
		//	  s=b1.getText();
			  b1.setText(b2.getText());
			  b2.setText("");
			  count++;
			  tf.setText(""+count);
		  }
		  if(b3.getText()==""){
				//	  s=b1.getText();
					  b3.setText(b2.getText());
					  b2.setText("");
					  count++;
					  tf.setText(""+count);
				  }
		  if(b5.getText()==""){
				//	  s=b1.getText();
					  b5.setText(b2.getText());
					  b2.setText("");
					  count++;
					  tf.setText(""+count);
				  }
	  }
	  if(e.getSource()==b3&&flag==0){
		  if(b2.getText()==""){
		//	  s=b1.getText();
			  b2.setText(b3.getText());
			  b3.setText("");
			  count++;
			  tf.setText(""+count);
		  }
		  if(b6.getText()==""){
				//	  s=b1.getText();
					  b6.setText(b3.getText());
					  b3.setText("");
					  count++;
					  tf.setText(""+count);
				  }
	  }
	  if(e.getSource()==b4&&flag==0){
		  if(b1.getText()==""){
		//	  s=b1.getText();
			  b1.setText(b4.getText());
			  b4.setText("");
			  count++;
			  tf.setText(""+count);
		  }
		  if(b5.getText()==""){
				//	  s=b1.getText();
					  b5.setText(b4.getText());
					  b4.setText("");
					  count++;
					  tf.setText(""+count);
				  }
		  if(b7.getText()==""){
				//	  s=b1.getText();
					  b7.setText(b4.getText());
					  b4.setText("");
					  count++;
					  tf.setText(""+count);
				  }
	  }
	  if(e.getSource()==b5&&flag==0){
		  if(b2.getText()==""){
		//	  s=b1.getText();
			  b2.setText(b5.getText());
			  b5.setText("");
			  count++;
			  tf.setText(""+count);
		  }
		  if(b4.getText()==""){
				//	  s=b1.getText();
					  b4.setText(b5.getText());
					  b5.setText("");
					  count++;
					  tf.setText(""+count);
				  }
		  if(b6.getText()==""){
				//	  s=b1.getText();
					  b6.setText(b5.getText());
					  b5.setText("");
					  count++;
					  tf.setText(""+count);
				  }
		  if(b8.getText()==""){
				//	  s=b1.getText();
					  b8.setText(b5.getText());
					  b5.setText("");
					  count++;
					  tf.setText(""+count);
				  }
	  }
	  if(e.getSource()==b6&&flag==0){
		  if(b3.getText()==""){
		//	  s=b1.getText();
			  b3.setText(b6.getText());
			  b6.setText("");
			  count++;
			  tf.setText(""+count);
		  }
		  if(b5.getText()==""){
				//	  s=b1.getText();
					  b5.setText(b6.getText());
					  b6.setText("");
					  count++;
					  tf.setText(""+count);
				  }
		  if(b9.getText()==""){
				//	  s=b1.getText();
					  b9.setText(b6.getText());
					  b6.setText("");
					  count++;
					  tf.setText(""+count);
				  }
	  }
	  if(e.getSource()==b7&&flag==0){
		  if(b4.getText()==""){
		//	  s=b1.getText();
			  b4.setText(b7.getText());
			  b7.setText("");
			  count++;
			  tf.setText(""+count);
		  }
		  if(b8.getText()==""){
				//	  s=b1.getText();
					  b8.setText(b7.getText());
					  b7.setText("");
					  count++;
					  tf.setText(""+count);
				  }
	  }
	  if(e.getSource()==b8&&flag==0){
		  if(b5.getText()==""){
		//	  s=b1.getText();
			  b5.setText(b8.getText());
			  b8.setText("");
			  count++;
			  tf.setText(""+count);
		  }
		  if(b7.getText()==""){
				//	  s=b1.getText();
					  b7.setText(b8.getText());
					  b8.setText("");
					  count++;
					  tf.setText(""+count);
				  }
		  if(b9.getText()==""){
				//	  s=b1.getText();
					  b9.setText(b8.getText());
					  b8.setText("");
					  count++;
					  tf.setText(""+count);
				  }
	  }
	  if(e.getSource()==b9&&flag==0){
		  if(b6.getText()==""){
		//	  s=b1.getText();
			  b6.setText(b9.getText());
			  b9.setText("");
			  count++;
			  tf.setText(""+count);
		  }
		  if(b8.getText()==""){
				//	  s=b1.getText();
					  b8.setText(b9.getText());
					  b9.setText("");
					  count++;
					  tf.setText(""+count);
				  }
	  }
	  if(e.getSource()==next&&flag==0){
		  count=0;
		  b1.setText("6");
		  b2.setText("");
		  b3.setText("7");
		  b4.setText("4");
		  b5.setText("1");
		  b6.setText("3");
		  b7.setText("2");
		  b8.setText("5");
		  b9.setText("8");
		  tf.setText("0");
		  
	  }
	  if(b1.getText().equals("1")&&b2.getText().equals("2")&&b3.getText().equals("3")&&b4.getText().equals("4")&&b5.getText().equals("5")&&b6.getText().equals("6")&&b7.getText().equals("7")&&b8.getText().equals("8")){
		  tf2.setText("you won");
		  tf2.setBounds(130, 20, 120, 30);
		  f.add(tf2);
		  count=0;
		  flag=1;
	  }
	  if(e.getSource()==pa){
		  tf2.setText("");
		  count=0;
		  f.add(tf2);
		  b1.setText("6");
		  b2.setText("");
		  b3.setText("7");
		  b4.setText("4");
		  b5.setText("1");
		  b6.setText("3");
		  b7.setText("2");
		  b8.setText("5");
		  b9.setText("8");
		  tf.setText("0");
		  f.add(tf2);
		  flag=0;
	  }
  }
  public static void main(String[]s){
	  new puzzlemy();
  }
}
