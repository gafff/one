/**
 *  объявление пакета
 */
package kr.KR;
/**
 * Библиотеки необходимые для работы
 */
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * Объявление публичного класса для создания окна 
 */
public class ComponentForm extends JFrame {
	/**
	 * Описание компонентов формы
	 */
	JPanel contentPane;
	JPanel Panel1;
	JPanel Panel2;
	static JLabel label_1;
	static JLabel label_2;
	static JLabel label_3;
	static JTextField TxtBox1; 
	static JTextField TxtBox2;
	public static JFrame frame;
	static JButton btnNewButton;
/**
	 * Объявление метода, в котором объявляются элементы экранной формы
	 * SuppressWarnings-это объявление аннотации для отключения предупреждений об ошибках
	 * Значок собаки может использоваться и для вызова индентифицирующих методов, для инициализации потоковых ресурсов
	 */
	@SuppressWarnings("deprecation")
	ComponentForm() {
		/**
		 * Задание шрифта и размера надписей для кнопок, меток;
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 20);
		/**
		 * Создание и настройка компонентов формы
		 */
		JPanel Panel1 = new JPanel();
		TxtBox1=new JTextField("");
		TxtBox1.setFont(font);
		TxtBox1.setPreferredSize( new Dimension( 100, 24 ) );
		TxtBox2=new JTextField();
		TxtBox2.setFont(font);
		TxtBox2.setPreferredSize( new Dimension( 100, 24 ) );
		label_1=new JLabel("Максимальная мощность, Вт");
		label_1.setFont(font);
		label_2=new JLabel("Напряжение сети, В");
		label_2.setFont(font);
		label_3=new JLabel(" ");
		label_3.setFont(font);
		btnNewButton=new JButton("Расчитать");
		btnNewButton.setFont(font);
		Panel1 = new JPanel();
