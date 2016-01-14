package ivt3.herzen.spb.ru;
import javax.swing.*;

public class App {
        public static void main(String[] args) {
                JFrame frame = new JFrame("Calculator");
                frame.setSize(480, 60);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();
                frame.add(panel);
                placeComponents(panel);

                frame.setVisible(true);
        }
        private static void placeComponents(JPanel panel) {

                panel.setLayout(null);
                String[] petStrings = { "+", "-", "/", "*" };

                final JTextField jTextField1 = new JTextField(10);
                jTextField1.setBounds(0, 0, 80, 20);
                panel.add(jTextField1);

                final JComboBox<String> method = new JComboBox<String>(petStrings);
                method.setBounds(90,0,80,20);
                panel.add(method);

                final JTextField jTextField2 = new JTextField(20);
                jTextField2.setBounds(180, 0, 80, 20);
                panel.add(jTextField2);

                JButton loginButton = new JButton("Solve");
                loginButton.setBounds(270, 0, 80, 20);

                final JLabel jLabel = new JLabel();
                jLabel.setBounds(400,0,80,20);
                panel.add(jLabel);

                loginButton.addActionListener(e -> {
                                String value;
                                int fValue = Integer.parseInt(jTextField1.getText());
                                int sValue = Integer.parseInt(jTextField2.getText());
                                value=method.getSelectedItem().toString();
                                switch (value) {
                                        case "+":
                                                jLabel.setText(Integer.toString(fValue + sValue));
                                                break;
                                        case "-":
                                                jLabel.setText(Integer.toString(fValue - sValue));
                                                break;
                                        case "*":
                                                jLabel.setText(Integer.toString(fValue * sValue));
                                                break;
                                        case "/":
                                                jLabel.setText(Float.toString((float) fValue / (float) sValue));
                                                break;
                                }
                        }
                );
                panel.add(loginButton);

        }
}
