package de.nicklee.demun.gui;

import de.nicklee.demun.CommitteeState;
import de.nicklee.demun.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class committeeSettingsDialog extends JDialog {
    private CommitteeState parentCommitteeState;
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton MoveLeft;
    private JButton moveRight;
    private JTextField nameField;
    private JTextField topic1Field;
    private JTextField topic2Field;
    private JScrollPane leftScrollPane;
    private JScrollPane rightScrollPane;
    private JPanel speakerTimeHolder;
    private SetSpeakerTimePanel speakerTimePanel;

    public committeeSettingsDialog(CommitteeState cs, MainWindow parentWindow) {
        parentCommitteeState = cs;
        setContentPane(contentPane);
        setVisible(true);
        setMinimumSize(new Dimension(550, 450));
        setModalityType(ModalityType.APPLICATION_MODAL);
        setTitle("Committee Settings");
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onOK();
                parentWindow.update();
                dispose();
            }
        });
    }

    private void onOK() {
// add your code here
        parentCommitteeState.setCommitteeName(nameField.getText());
        parentCommitteeState.setTopic1(topic1Field.getText());
        parentCommitteeState.setTopic2(topic2Field.getText());
        parentCommitteeState.setDefaultSpeakingSeconds(speakerTimePanel.getSeconds());
        parentCommitteeState.setDefaultSpeakingMinutes(speakerTimePanel.getMinutes());
    }

    private void createUIComponents() {
        nameField = new JTextField(parentCommitteeState.getCommitteeName());
        topic1Field = new JTextField(parentCommitteeState.getTopic1());
        topic2Field = new JTextField(parentCommitteeState.getTopic2());
        speakerTimePanel = new SetSpeakerTimePanel();
        speakerTimePanel.setSeconds(parentCommitteeState.getDefaultSpeakingSeconds());
        speakerTimePanel.setMinutes(parentCommitteeState.getDefaultSpeakingMinutes());
        speakerTimeHolder = new JPanel();
        speakerTimeHolder.add(speakerTimePanel);
    }
}
