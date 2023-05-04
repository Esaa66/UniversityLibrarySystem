package Objects;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LibraryGUI extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldTitle;
    private JTextField textFieldAuthor;
    private JTextField textFieldISBN;
    private JTextField textFieldSubject;
    private JList<Item> listSearchResults;

    /**
     * Create the frame.
     */
    public LibraryGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panelSearch = new JPanel();
        contentPane.add(panelSearch, BorderLayout.NORTH);

        JLabel lblTitle = new JLabel("Title:");
        panelSearch.add(lblTitle);

        textFieldTitle = new JTextField();
        panelSearch.add(textFieldTitle);
        textFieldTitle.setColumns(10);

        JLabel lblAuthor = new JLabel("Author:");
        panelSearch.add(lblAuthor);

        textFieldAuthor = new JTextField();
        panelSearch.add(textFieldAuthor);
        textFieldAuthor.setColumns(10);

        JLabel lblIsbn = new JLabel("ISBN:");
        panelSearch.add(lblIsbn);

        textFieldISBN = new JTextField();
        panelSearch.add(textFieldISBN);
        textFieldISBN.setColumns(10);

        JLabel lblSubject = new JLabel("Subject:");
        panelSearch.add(lblSubject);

        textFieldSubject = new JTextField();
        panelSearch.add(textFieldSubject);
        textFieldSubject.setColumns(10);

        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Item item = new Item();
                ArrayList<Item> results = item.searchObjects(textFieldTitle.getText(), textFieldAuthor.getText(), textFieldISBN.getText(), textFieldSubject.getText());
                listSearchResults.setListData(results.toArray(new LibraryObject[0]));
            }
        });
        panelSearch.add(btnSearch);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        listSearchResults = new JList<>();
        scrollPane.setViewportView(listSearchResults);
    }
}
