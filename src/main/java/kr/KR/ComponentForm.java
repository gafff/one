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
