/**
*Java1Homework8
*
*@author Sarycheva Oksana
*@version 19.04.2022
*/

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

class CounterApp extends JFrame{
    private int value;
    
    public static void main(String[] args) {
        new CounterApp(0);
    }
    
    CounterApp(final int initialValue){//конструктор нашего класса
        setTitle("SimpleCounter");//установка заголовка окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);//в качестве парам. - константа (финализир. поле); при закрытии получившегося окна приложение перестает работать
        setSize(300, 280);//определяем размеры окна (ширина и высота в пикселях)
        setLocationRelativeTo(null);//определим положение окна (ставим его в центр экрана)
        
        Font font = new Font("Arial", Font.BOLD, 42);//параметры шрифта
        
        value = initialValue;//присваиваем переменой значение параметра и уже с ней будем работать
        
        JLabel counterValueView = new JLabel();//вид значения счетчика
        counterValueView.setFont(font);//устанавливаем размер шрифта для этого эл-та
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER); //отцентрируем значение счетчика
        add(counterValueView, BorderLayout.CENTER);//размещаем метку
        
        counterValueView.setText(String.valueOf(value)); //придаем значение метке (значение нашего счетчика)(вызываем у объекта counterValueView метод setText())
                               
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(decrementButton, BorderLayout.WEST);
        
        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(incrementButton, BorderLayout.EAST);
        
        setVisible(true);//указывает, что после всей подготовки окно можно делать видимым
    }
}