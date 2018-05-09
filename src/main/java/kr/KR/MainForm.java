/**
 * объявление пакета
 */
package kr.KR;
/**
 * Импорт библиотек классов, необходимых для работы.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/**
 * 
 * Объявление публичного класса, наследующего члены класса JFrame 
 */
public class MainForm extends JFrame {
	public static ImageIcon icon1 = new ImageIcon(MainForm.class.getResource("/main.png"));
	/**
	 * Метод, отвечающий за запуск фрейма
	 * 
	 */
	public static void main(String[] args) throws Exception {
		/**
		 * Создание и вызов главной формы
		 */
					MainForm frame = new MainForm();
					frame.setVisible(true);
	}
	/**
	 * Объявление метода, в котором объявляются элементы экранной формы, ее события
	 */
	public MainForm() throws Exception {
		ImageIcon icon2 = new ImageIcon(MainForm.class.getResource("/home.png"));
		ImageIcon icon3 = new ImageIcon(MainForm.class.getResource("/production.png"));
		/**
		 * Создание главной панели
		 */
		TitledBorder titledBorder = BorderFactory.createTitledBorder(null, "Выберите необходимый вам калькулятор", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("times new roman",Font.PLAIN,15), Color.black);
		JPanel contentPane = new JPanel();
		/**
		 * Отключение автоматичского размещения компонентов на панели
		 */
		contentPane.setLayout(null);
		contentPane.setBorder(titledBorder);
		JPanel Panel1 = new JPanel();
                /**
		 * указывает координаты верхней левой вершины окна, а также его ширину и высоту.
		 */
		Panel1.setBounds(50,15,500,650);
		JPanel Panel2 = new JPanel();
		this.setIconImage(icon1.getImage());
		/**
		 * Отключение автоматичского размещения компонентов на панели
		 */
		Panel2.setLayout(null);
		/**
		 * указывает координаты верхней левой вершины окна, а также его ширину и высоту.
		 */
		Panel2.setBounds(5,15,650,650);
		/**
		 * Задание шрифта и размера надписей для кнопок
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 25);
