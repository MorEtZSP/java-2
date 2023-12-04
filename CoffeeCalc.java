package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class CoffeeCalc {
public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 60));
    frame.setTitle("CoffeeCalc");
    frame.setSize(300, 200);
    frame.setLocation(100, 200);
    JComboBox<String> comboWithType = new JComboBox<>(new String[] { "Эспрессо", "Американо", "Латте", "Капучино", "Маккиато" });
    JComboBox<String> comboWithSize = new JComboBox<>(new String[] { "Маленький", "Средний", "Большой", "XXL" });
    JCheckBox sugar = new JCheckBox("Сахар");
    JCheckBox cream = new JCheckBox("Сливки");
    JButton calc = new JButton("Рассчитать стоимость");
    JLabel label = new JLabel("Цена: ");
    calc.addActionListener(new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int sum = 0;
        switch (String.valueOf(comboWithType.getSelectedItem())) {
            case "Эспрессо":
                sum += 100;
                break;
            case "Американо":
                sum += 120;
                break;
            case "Латте":
                sum += 140;
                break;
            case "Капучино":
                sum += 150;
                break;
            case "Маккиато":
                sum += 170;
                break;}
        switch (String.valueOf(comboWithSize.getSelectedItem())) {
            case "Маленький":
                sum *= 1.2;
                break;
            case "Средний":
                sum *= 1.5;
                break;
            case "Большой":
                sum *= 1.6;
                break;
            case "XXL":
                sum *= 1.8;
                break;}
            if (sugar.isSelected()) {sum += 2;}
            if (cream.isSelected()) {sum += 10;}
            label.setText("Цена: " + (int) sum);}});
        frame.add(comboWithType);
        frame.add(comboWithSize);
        frame.add(sugar);
        frame.add(cream);
        frame.add(calc);
        frame.add(label);
        frame.setVisible(true);}}
