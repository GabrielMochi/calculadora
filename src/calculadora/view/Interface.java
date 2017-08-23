package calculadora.view;

import calculadora.service.Motor;
import static java.awt.EventQueue.invokeLater;

public class Interface extends javax.swing.JFrame {
    
    private static final char MEIA_RISCA = '–';
    
    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        result = new javax.swing.JTextField();
        _7 = new javax.swing.JButton();
        _8 = new javax.swing.JButton();
        _9 = new javax.swing.JButton();
        _4 = new javax.swing.JButton();
        _5 = new javax.swing.JButton();
        _6 = new javax.swing.JButton();
        _1 = new javax.swing.JButton();
        _2 = new javax.swing.JButton();
        _3 = new javax.swing.JButton();
        _0 = new javax.swing.JButton();
        less = new javax.swing.JButton();
        ans = new javax.swing.JButton();
        del = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        obelus = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        times = new javax.swing.JButton();
        virgula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painel.setBackground(new java.awt.Color(51, 51, 51));

        display.setEditable(false);
        display.setBackground(new java.awt.Color(102, 102, 0));
        display.setColumns(20);
        display.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        display.setLineWrap(true);
        display.setRows(5);
        display.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        display.setFocusable(false);
        display.setSelectedTextColor(new java.awt.Color(102, 102, 0));
        display.setSelectionColor(new java.awt.Color(102, 102, 0));
        jScrollPane1.setViewportView(display);

        result.setEditable(false);
        result.setBackground(new java.awt.Color(102, 102, 0));
        result.setFont(new java.awt.Font("Lucida Fax", 1, 20)); // NOI18N
        result.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        _7.setBackground(new java.awt.Color(0, 0, 0));
        _7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _7.setForeground(new java.awt.Color(255, 255, 255));
        _7.setText("7");
        _7.setBorder(null);
        _7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _7.setFocusPainted(false);
        _7.setFocusable(false);
        _7.setMaximumSize(new java.awt.Dimension(60, 30));
        _7.setMinimumSize(new java.awt.Dimension(60, 30));
        _7.setPreferredSize(new java.awt.Dimension(55, 35));
        _7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _7MouseClicked(evt);
            }
        });
        _7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7ActionPerformed(evt);
            }
        });

        _8.setBackground(new java.awt.Color(0, 0, 0));
        _8.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _8.setForeground(new java.awt.Color(255, 255, 255));
        _8.setText("8");
        _8.setBorder(null);
        _8.setBorderPainted(false);
        _8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _8.setFocusPainted(false);
        _8.setFocusable(false);
        _8.setMaximumSize(new java.awt.Dimension(60, 30));
        _8.setMinimumSize(new java.awt.Dimension(60, 30));
        _8.setPreferredSize(new java.awt.Dimension(55, 35));
        _8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _8MouseClicked(evt);
            }
        });

        _9.setBackground(new java.awt.Color(0, 0, 0));
        _9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _9.setForeground(new java.awt.Color(255, 255, 255));
        _9.setText("9");
        _9.setBorder(null);
        _9.setBorderPainted(false);
        _9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _9.setFocusPainted(false);
        _9.setFocusable(false);
        _9.setMaximumSize(new java.awt.Dimension(60, 30));
        _9.setMinimumSize(new java.awt.Dimension(60, 30));
        _9.setPreferredSize(new java.awt.Dimension(55, 35));
        _9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _9MouseClicked(evt);
            }
        });

        _4.setBackground(new java.awt.Color(0, 0, 0));
        _4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _4.setForeground(new java.awt.Color(255, 255, 255));
        _4.setText("4");
        _4.setBorder(null);
        _4.setBorderPainted(false);
        _4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _4.setFocusPainted(false);
        _4.setFocusable(false);
        _4.setMaximumSize(new java.awt.Dimension(55, 35));
        _4.setMinimumSize(new java.awt.Dimension(55, 35));
        _4.setPreferredSize(new java.awt.Dimension(55, 35));
        _4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _4MouseClicked(evt);
            }
        });

        _5.setBackground(new java.awt.Color(0, 0, 0));
        _5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _5.setForeground(new java.awt.Color(255, 255, 255));
        _5.setText("5");
        _5.setBorder(null);
        _5.setBorderPainted(false);
        _5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _5.setFocusPainted(false);
        _5.setFocusable(false);
        _5.setMaximumSize(new java.awt.Dimension(55, 35));
        _5.setMinimumSize(new java.awt.Dimension(55, 35));
        _5.setPreferredSize(new java.awt.Dimension(55, 35));
        _5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _5MouseClicked(evt);
            }
        });

        _6.setBackground(new java.awt.Color(0, 0, 0));
        _6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _6.setForeground(new java.awt.Color(255, 255, 255));
        _6.setText("6");
        _6.setBorder(null);
        _6.setBorderPainted(false);
        _6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _6.setFocusPainted(false);
        _6.setFocusable(false);
        _6.setMaximumSize(new java.awt.Dimension(55, 35));
        _6.setMinimumSize(new java.awt.Dimension(55, 35));
        _6.setPreferredSize(new java.awt.Dimension(55, 35));
        _6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _6MouseClicked(evt);
            }
        });

        _1.setBackground(new java.awt.Color(0, 0, 0));
        _1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _1.setForeground(new java.awt.Color(255, 255, 255));
        _1.setText("1");
        _1.setBorder(null);
        _1.setBorderPainted(false);
        _1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _1.setFocusPainted(false);
        _1.setFocusable(false);
        _1.setMaximumSize(new java.awt.Dimension(55, 35));
        _1.setMinimumSize(new java.awt.Dimension(55, 35));
        _1.setPreferredSize(new java.awt.Dimension(55, 35));
        _1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _1MouseClicked(evt);
            }
        });

        _2.setBackground(new java.awt.Color(0, 0, 0));
        _2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _2.setForeground(new java.awt.Color(255, 255, 255));
        _2.setText("2");
        _2.setBorder(null);
        _2.setBorderPainted(false);
        _2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _2.setFocusPainted(false);
        _2.setFocusable(false);
        _2.setMaximumSize(new java.awt.Dimension(55, 35));
        _2.setMinimumSize(new java.awt.Dimension(55, 35));
        _2.setPreferredSize(new java.awt.Dimension(55, 35));
        _2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _2MouseClicked(evt);
            }
        });

        _3.setBackground(new java.awt.Color(0, 0, 0));
        _3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _3.setForeground(new java.awt.Color(255, 255, 255));
        _3.setText("3");
        _3.setBorder(null);
        _3.setBorderPainted(false);
        _3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _3.setFocusPainted(false);
        _3.setFocusable(false);
        _3.setMaximumSize(new java.awt.Dimension(55, 35));
        _3.setMinimumSize(new java.awt.Dimension(55, 35));
        _3.setPreferredSize(new java.awt.Dimension(55, 35));
        _3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _3MouseClicked(evt);
            }
        });

        _0.setBackground(new java.awt.Color(0, 0, 0));
        _0.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        _0.setForeground(new java.awt.Color(255, 255, 255));
        _0.setText("0");
        _0.setBorder(null);
        _0.setBorderPainted(false);
        _0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _0.setFocusPainted(false);
        _0.setFocusable(false);
        _0.setMaximumSize(new java.awt.Dimension(55, 35));
        _0.setMinimumSize(new java.awt.Dimension(55, 35));
        _0.setPreferredSize(new java.awt.Dimension(55, 35));
        _0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _0MouseClicked(evt);
            }
        });

        less.setBackground(new java.awt.Color(0, 0, 0));
        less.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        less.setForeground(new java.awt.Color(255, 255, 255));
        less.setText("(-)");
        less.setBorder(null);
        less.setBorderPainted(false);
        less.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        less.setFocusPainted(false);
        less.setFocusable(false);
        less.setMaximumSize(new java.awt.Dimension(55, 35));
        less.setMinimumSize(new java.awt.Dimension(55, 35));
        less.setPreferredSize(new java.awt.Dimension(55, 35));
        less.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lessMouseClicked(evt);
            }
        });

        ans.setBackground(new java.awt.Color(0, 0, 0));
        ans.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ans.setForeground(new java.awt.Color(255, 255, 255));
        ans.setText("Ans");
        ans.setBorder(null);
        ans.setBorderPainted(false);
        ans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ans.setFocusPainted(false);
        ans.setFocusable(false);
        ans.setMaximumSize(new java.awt.Dimension(55, 35));
        ans.setMinimumSize(new java.awt.Dimension(55, 35));
        ans.setPreferredSize(new java.awt.Dimension(55, 35));
        ans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ansMouseClicked(evt);
            }
        });

        del.setBackground(new java.awt.Color(255, 204, 0));
        del.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        del.setText("DEL");
        del.setBorder(null);
        del.setBorderPainted(false);
        del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        del.setFocusPainted(false);
        del.setFocusable(false);
        del.setMaximumSize(new java.awt.Dimension(60, 30));
        del.setMinimumSize(new java.awt.Dimension(60, 30));
        del.setPreferredSize(new java.awt.Dimension(60, 30));
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delMouseClicked(evt);
            }
        });

        ac.setBackground(new java.awt.Color(255, 204, 0));
        ac.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ac.setText("AC");
        ac.setBorder(null);
        ac.setBorderPainted(false);
        ac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ac.setFocusPainted(false);
        ac.setFocusable(false);
        ac.setMaximumSize(new java.awt.Dimension(55, 35));
        ac.setMinimumSize(new java.awt.Dimension(55, 35));
        ac.setPreferredSize(new java.awt.Dimension(55, 35));
        ac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acMouseClicked(evt);
            }
        });

        plus.setBackground(new java.awt.Color(0, 0, 0));
        plus.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 255, 255));
        plus.setText("+");
        plus.setBorder(null);
        plus.setBorderPainted(false);
        plus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus.setFocusPainted(false);
        plus.setFocusable(false);
        plus.setMaximumSize(new java.awt.Dimension(60, 30));
        plus.setMinimumSize(new java.awt.Dimension(60, 30));
        plus.setPreferredSize(new java.awt.Dimension(60, 30));
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusMouseClicked(evt);
            }
        });

        minus.setBackground(new java.awt.Color(0, 0, 0));
        minus.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setText("-");
        minus.setBorder(null);
        minus.setBorderPainted(false);
        minus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus.setFocusPainted(false);
        minus.setFocusable(false);
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMouseClicked(evt);
            }
        });

        obelus.setBackground(new java.awt.Color(0, 0, 0));
        obelus.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        obelus.setForeground(new java.awt.Color(255, 255, 255));
        obelus.setText("/");
        obelus.setBorder(null);
        obelus.setBorderPainted(false);
        obelus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        obelus.setFocusPainted(false);
        obelus.setFocusable(false);
        obelus.setMaximumSize(new java.awt.Dimension(60, 30));
        obelus.setMinimumSize(new java.awt.Dimension(60, 30));
        obelus.setPreferredSize(new java.awt.Dimension(60, 30));
        obelus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obelusMouseClicked(evt);
            }
        });

        equals.setBackground(new java.awt.Color(0, 0, 0));
        equals.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        equals.setForeground(new java.awt.Color(255, 255, 255));
        equals.setText("=");
        equals.setBorder(null);
        equals.setBorderPainted(false);
        equals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equals.setFocusPainted(false);
        equals.setFocusable(false);
        equals.setMaximumSize(new java.awt.Dimension(60, 30));
        equals.setMinimumSize(new java.awt.Dimension(60, 30));
        equals.setPreferredSize(new java.awt.Dimension(60, 30));
        equals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalsMouseClicked(evt);
            }
        });

        times.setBackground(new java.awt.Color(0, 0, 0));
        times.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        times.setForeground(new java.awt.Color(255, 255, 255));
        times.setText("*");
        times.setBorder(null);
        times.setBorderPainted(false);
        times.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        times.setFocusPainted(false);
        times.setFocusable(false);
        times.setMaximumSize(new java.awt.Dimension(60, 30));
        times.setMinimumSize(new java.awt.Dimension(60, 30));
        times.setPreferredSize(new java.awt.Dimension(60, 30));
        times.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timesMouseClicked(evt);
            }
        });

        virgula.setBackground(new java.awt.Color(0, 0, 0));
        virgula.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        virgula.setForeground(new java.awt.Color(255, 255, 255));
        virgula.setText(",");
        virgula.setBorder(null);
        virgula.setBorderPainted(false);
        virgula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        virgula.setFocusPainted(false);
        virgula.setFocusable(false);
        virgula.setMaximumSize(new java.awt.Dimension(55, 35));
        virgula.setMinimumSize(new java.awt.Dimension(55, 35));
        virgula.setPreferredSize(new java.awt.Dimension(55, 35));
        virgula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                virgulaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelLayout.createSequentialGroup()
                                                .addComponent(_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(painelLayout.createSequentialGroup()
                                                .addComponent(_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(less, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(obelus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(painelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelLayout.createSequentialGroup()
                                                .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                                .addComponent(_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(_8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)))
                                        .addGap(4, 4, 4)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(_9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(result)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obelus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(less, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__7MouseClicked
        display.setText(display.getText() + 7);
    }//GEN-LAST:event__7MouseClicked

    private void _8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__8MouseClicked
        display.setText(display.getText() + 8);
    }//GEN-LAST:event__8MouseClicked

    private void _9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__9MouseClicked
        display.setText(display.getText() + 9);
    }//GEN-LAST:event__9MouseClicked

    private void delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseClicked
        if (display.getText() != null && !display.getText().isEmpty()) {
            String text = display.getText();
            char[] newText = new char[text.length() - 1];

            for (int i = 0; i < newText.length; i++)
                newText[i] = text.charAt(i);

            display.setText(String.valueOf(newText));
        }
    }//GEN-LAST:event_delMouseClicked

    private void acMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseClicked
        display.setText(new String());
        result.setText(new String());
    }//GEN-LAST:event_acMouseClicked

    private void _4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__4MouseClicked
        display.setText(display.getText() + 4);
    }//GEN-LAST:event__4MouseClicked

    private void _5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__5MouseClicked
        display.setText(display.getText() + 5);
    }//GEN-LAST:event__5MouseClicked

    private void _6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__6MouseClicked
        display.setText(display.getText() + 6);
    }//GEN-LAST:event__6MouseClicked

    private void plusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseClicked
        display.setText(display.getText() + "+");
    }//GEN-LAST:event_plusMouseClicked

    private void minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseClicked
        display.setText(display.getText() + MEIA_RISCA);
    }//GEN-LAST:event_minusMouseClicked

    private void _1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__1MouseClicked
        display.setText(display.getText() + 1);
    }//GEN-LAST:event__1MouseClicked

    private void _2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__2MouseClicked
        display.setText(display.getText() + 2);
    }//GEN-LAST:event__2MouseClicked

    private void _3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__3MouseClicked
        display.setText(display.getText() + 3);
    }//GEN-LAST:event__3MouseClicked

    private void timesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesMouseClicked
        display.setText(display.getText() + "*");
    }//GEN-LAST:event_timesMouseClicked

    private void obelusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obelusMouseClicked
        display.setText(display.getText() + "/");
    }//GEN-LAST:event_obelusMouseClicked

    private void _0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__0MouseClicked
        display.setText(display.getText() + 0);
    }//GEN-LAST:event__0MouseClicked

    private void lessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessMouseClicked
        display.setText(display.getText() + "-");
    }//GEN-LAST:event_lessMouseClicked

    private void ansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansMouseClicked
        display.setText(display.getText() + result.getText());
    }//GEN-LAST:event_ansMouseClicked

    private void equalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalsMouseClicked
        result.setText(Motor.calcResultado(display.getText()));
    }//GEN-LAST:event_equalsMouseClicked

    private void virgulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virgulaMouseClicked
        display.setText(display.getText() + ",");
    }//GEN-LAST:event_virgulaMouseClicked

    private void _7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__7ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultActionPerformed

    public static void launch(String args[]) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _0;
    private javax.swing.JButton _1;
    private javax.swing.JButton _2;
    private javax.swing.JButton _3;
    private javax.swing.JButton _4;
    private javax.swing.JButton _5;
    private javax.swing.JButton _6;
    private javax.swing.JButton _7;
    private javax.swing.JButton _8;
    private javax.swing.JButton _9;
    private javax.swing.JButton ac;
    private javax.swing.JButton ans;
    private javax.swing.JButton del;
    private javax.swing.JTextArea display;
    private javax.swing.JButton equals;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton less;
    private javax.swing.JButton minus;
    private javax.swing.JButton obelus;
    private javax.swing.JPanel painel;
    private javax.swing.JButton plus;
    private javax.swing.JTextField result;
    private javax.swing.JButton times;
    private javax.swing.JButton virgula;
    // End of variables declaration//GEN-END:variables
}
