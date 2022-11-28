import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.text.DecimalFormat;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Mortgage {

    private JFrame frmMortgageCalculator;
    private JTextField amountField;
    private JTextField rateField;
    private JTextField yearsField;
    private JTextField paymentField;

    DecimalFormat df = new DecimalFormat("###.##");
    private final DefaultTableModel model = new DefaultTableModel();
    private final String[] column = { "Month", "Monthly Payment", "Interest Paid", "Principal", "Balance Remaining" };

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Mortgage window = new Mortgage();
                window.frmMortgageCalculator.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Mortgage() {
        initialize();
    }

    private void initialize() {
        frmMortgageCalculator = new JFrame();
        frmMortgageCalculator.setTitle("Mortgage Calculator");
        frmMortgageCalculator.setBounds(100, 100, 799, 495);
        frmMortgageCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
        gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
        frmMortgageCalculator.getContentPane().setLayout(gridBagLayout);

        Component verticalStrut = Box.createVerticalStrut(10);
        GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
        gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
        gbc_verticalStrut.fill = GridBagConstraints.BOTH;
        gbc_verticalStrut.gridwidth = 4;
        gbc_verticalStrut.gridx = 1;
        gbc_verticalStrut.gridy = 0;
        frmMortgageCalculator.getContentPane().add(verticalStrut, gbc_verticalStrut);

        JLabel lblLoanAmount = new JLabel("Loan Amount");
        GridBagConstraints gbc_lblLoanAmount = new GridBagConstraints();
        gbc_lblLoanAmount.insets = new Insets(0, 0, 5, 5);
        gbc_lblLoanAmount.gridx = 2;
        gbc_lblLoanAmount.gridy = 1;
        frmMortgageCalculator.getContentPane().add(lblLoanAmount, gbc_lblLoanAmount);

        amountField = new JTextField();
        GridBagConstraints gbc_amountField = new GridBagConstraints();
        gbc_amountField.insets = new Insets(0, 0, 5, 5);
        gbc_amountField.fill = GridBagConstraints.HORIZONTAL;
        gbc_amountField.gridx = 3;
        gbc_amountField.gridy = 1;
        frmMortgageCalculator.getContentPane().add(amountField, gbc_amountField);
        amountField.setColumns(10);

        JLabel lblApr = new JLabel("APR (%)");
        GridBagConstraints gbc_lblApr = new GridBagConstraints();
        gbc_lblApr.anchor = GridBagConstraints.EAST;
        gbc_lblApr.insets = new Insets(0, 0, 5, 5);
        gbc_lblApr.gridx = 2;
        gbc_lblApr.gridy = 2;
        frmMortgageCalculator.getContentPane().add(lblApr, gbc_lblApr);

        rateField = new JTextField();
        GridBagConstraints gbc_rateField = new GridBagConstraints();
        gbc_rateField.insets = new Insets(0, 0, 5, 5);
        gbc_rateField.fill = GridBagConstraints.HORIZONTAL;
        gbc_rateField.gridx = 3;
        gbc_rateField.gridy = 2;
        frmMortgageCalculator.getContentPane().add(rateField, gbc_rateField);
        rateField.setColumns(10);

        Component horizontalStrut = Box.createHorizontalStrut(20);
        GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
        gbc_horizontalStrut.fill = GridBagConstraints.BOTH;
        gbc_horizontalStrut.gridwidth = 2;
        gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
        gbc_horizontalStrut.gridx = 0;
        gbc_horizontalStrut.gridy = 3;
        frmMortgageCalculator.getContentPane().add(horizontalStrut, gbc_horizontalStrut);

        JSeparator separator = new JSeparator();
        GridBagConstraints gbc_separator = new GridBagConstraints();
        gbc_separator.insets = new Insets(0, 0, 5, 5);
        gbc_separator.gridx = 1;
        gbc_separator.gridy = 3;
        frmMortgageCalculator.getContentPane().add(separator, gbc_separator);

        JLabel lblYears = new JLabel("Years");
        GridBagConstraints gbc_lblYears = new GridBagConstraints();
        gbc_lblYears.anchor = GridBagConstraints.EAST;
        gbc_lblYears.insets = new Insets(0, 0, 5, 5);
        gbc_lblYears.gridx = 2;
        gbc_lblYears.gridy = 3;
        frmMortgageCalculator.getContentPane().add(lblYears, gbc_lblYears);

        yearsField = new JTextField();
        GridBagConstraints gbc_yearsField = new GridBagConstraints();
        gbc_yearsField.insets = new Insets(0, 0, 5, 5);
        gbc_yearsField.fill = GridBagConstraints.HORIZONTAL;
        gbc_yearsField.gridx = 3;
        gbc_yearsField.gridy = 3;
        frmMortgageCalculator.getContentPane().add(yearsField, gbc_yearsField);
        yearsField.setColumns(10);

        Component horizontalStrut_1 = Box.createHorizontalStrut(20);
        GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
        gbc_horizontalStrut_1.fill = GridBagConstraints.BOTH;
        gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 5);
        gbc_horizontalStrut_1.gridx = 4;
        gbc_horizontalStrut_1.gridy = 3;
        frmMortgageCalculator.getContentPane().add(horizontalStrut_1, gbc_horizontalStrut_1);

        JLabel lblMontyPayment = new JLabel("Monthly Payment");
        GridBagConstraints gbc_lblMontyPayment = new GridBagConstraints();
        gbc_lblMontyPayment.anchor = GridBagConstraints.EAST;
        gbc_lblMontyPayment.insets = new Insets(0, 0, 5, 5);
        gbc_lblMontyPayment.gridx = 2;
        gbc_lblMontyPayment.gridy = 4;
        frmMortgageCalculator.getContentPane().add(lblMontyPayment, gbc_lblMontyPayment);

        paymentField = new JTextField();
        paymentField.setEditable(false);
        GridBagConstraints gbc_paymentField = new GridBagConstraints();
        gbc_paymentField.insets = new Insets(0, 0, 5, 5);
        gbc_paymentField.fill = GridBagConstraints.HORIZONTAL;
        gbc_paymentField.gridx = 3;
        gbc_paymentField.gridy = 4;
        frmMortgageCalculator.getContentPane().add(paymentField, gbc_paymentField);
        paymentField.setColumns(10);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(e -> {
            amountField.setText("");
            rateField.setText("");
            yearsField.setText("");
            paymentField.setText("");
        });

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(e -> {
            double startAmount, rateYears;
            int years;
            double result;
            String formattedResult;
            try {
                startAmount = Double.parseDouble(amountField.getText());
                rateYears = Double.parseDouble(rateField.getText());
                years = Integer.parseInt(yearsField.getText());
                result = calculateLoan(startAmount, rateYears, years);
                formattedResult = df.format(result);
                paymentField.setText(formattedResult);
                calculateMonthly(result, startAmount, rateYears, years);
            } catch (Exception e2) {
                paymentField.setText("Error");
            }

        });
        GridBagConstraints gbc_btnCalculate = new GridBagConstraints();
        gbc_btnCalculate.insets = new Insets(0, 0, 5, 5);
        gbc_btnCalculate.gridx = 2;
        gbc_btnCalculate.gridy = 5;
        frmMortgageCalculator.getContentPane().add(btnCalculate, gbc_btnCalculate);
        GridBagConstraints gbc_btnClear = new GridBagConstraints();
        gbc_btnClear.insets = new Insets(0, 0, 5, 5);
        gbc_btnClear.gridx = 3;
        gbc_btnClear.gridy = 5;
        frmMortgageCalculator.getContentPane().add(btnClear, gbc_btnClear);

        Component verticalStrut_1 = Box.createVerticalStrut(10);
        GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
        gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
        gbc_verticalStrut_1.fill = GridBagConstraints.BOTH;
        gbc_verticalStrut_1.gridwidth = 4;
        gbc_verticalStrut_1.gridx = 1;
        gbc_verticalStrut_1.gridy = 6;
        frmMortgageCalculator.getContentPane().add(verticalStrut_1, gbc_verticalStrut_1);

        JTable table = new JTable();
        model.setColumnIdentifiers(column);
        table.setFont(new Font("Arial", Font.PLAIN, 12));
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.setModel(model);

        JScrollPane scrollPane_1 = new JScrollPane(table);
        GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
        gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
        gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
        gbc_scrollPane_1.gridx = 3;
        gbc_scrollPane_1.gridy = 7;
        frmMortgageCalculator.getContentPane().add(scrollPane_1, gbc_scrollPane_1);

        Component verticalStrut_2 = Box.createVerticalStrut(20);
        GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
        gbc_verticalStrut_2.fill = GridBagConstraints.BOTH;
        gbc_verticalStrut_2.insets = new Insets(0, 0, 0, 5);
        gbc_verticalStrut_2.gridx = 3;
        gbc_verticalStrut_2.gridy = 8;
        frmMortgageCalculator.getContentPane().add(verticalStrut_2, gbc_verticalStrut_2);
    }

    private double calculateLoan(double startAmount, double rateYears, int years) {
        double rateMonthly = (rateYears / 100) / 12;
        int months = years * 12;
        double monthlyPayment;
        monthlyPayment = (startAmount * rateMonthly) / (1 - Math.pow(rateMonthly + 1, -months));
        return monthlyPayment;

    }

    private void calculateMonthly(double monthlyPayment, double startAmount, double rateYears, int years) {
        double balance = startAmount;
        double rateMonthly = (rateYears / 100) / 12;
        int months = years * 12;
        double interestPaid;
        double principalPaid;

        while (balance >= 0) {
            interestPaid = balance * rateMonthly;
            principalPaid = monthlyPayment - interestPaid;
            balance = balance - principalPaid;

            model.addRow(new Object[] { months, df.format(monthlyPayment), df.format(interestPaid),
                    df.format(principalPaid), df.format(balance) });

            months--;
        }
    }
}
