/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 
import java.util.Random; 

/**
 *
 * @author ASUS
 */
public class SortingAssignment extends javax.swing.JFrame {

    /**
     * Creates new form SortingAssignment
     */
    public SortingAssignment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        app = new javax.swing.JPanel();
        Topic = new javax.swing.JLabel();
        BinarySearchLabel = new javax.swing.JLabel();
        EnterValueLabel = new javax.swing.JLabel();
        InterpolationLabel = new javax.swing.JLabel();
        JumpLabel = new javax.swing.JLabel();
        LinearLabel = new javax.swing.JLabel();
        InterpolationRT = new javax.swing.JTextField();
        BinarySortRT = new javax.swing.JTextField();
        JumpSortRT = new javax.swing.JTextField();
        LinearSortRT = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        RunTimeLabel = new javax.swing.JLabel();
        show = new javax.swing.JScrollPane();
        ArrayShow = new javax.swing.JTextArea();
        Value = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        app.setBackground(new java.awt.Color(102, 102, 102));

        Topic.setBackground(new java.awt.Color(102, 102, 102));
        Topic.setFont(new java.awt.Font("Rage Italic", 1, 52)); // NOI18N
        Topic.setForeground(new java.awt.Color(153, 255, 255));
        Topic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Topic.setText("Run Time Checker");

        BinarySearchLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        BinarySearchLabel.setForeground(new java.awt.Color(255, 255, 255));
        BinarySearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BinarySearchLabel.setText("Binary Sort Search");

        EnterValueLabel.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        EnterValueLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterValueLabel.setText("Enter a value to search :");

        InterpolationLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        InterpolationLabel.setForeground(new java.awt.Color(255, 255, 255));
        InterpolationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InterpolationLabel.setText("Interpolation Search");

        JumpLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        JumpLabel.setForeground(new java.awt.Color(255, 255, 255));
        JumpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JumpLabel.setText("Jump Sort Search");

        LinearLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        LinearLabel.setForeground(new java.awt.Color(255, 255, 255));
        LinearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LinearLabel.setText("Linear Sort Search");

        InterpolationRT.setEditable(false);
        InterpolationRT.setBackground(new java.awt.Color(0, 0, 0));
        InterpolationRT.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        InterpolationRT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        InterpolationRT.setEnabled(false);
        InterpolationRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterpolationRTActionPerformed(evt);
            }
        });

        BinarySortRT.setEditable(false);
        BinarySortRT.setBackground(new java.awt.Color(0, 0, 0));
        BinarySortRT.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        BinarySortRT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BinarySortRT.setEnabled(false);
        BinarySortRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinarySortRTActionPerformed(evt);
            }
        });

        JumpSortRT.setEditable(false);
        JumpSortRT.setBackground(new java.awt.Color(0, 0, 0));
        JumpSortRT.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        JumpSortRT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JumpSortRT.setEnabled(false);
        JumpSortRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumpSortRTActionPerformed(evt);
            }
        });

        LinearSortRT.setEditable(false);
        LinearSortRT.setBackground(new java.awt.Color(0, 0, 0));
        LinearSortRT.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        LinearSortRT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        LinearSortRT.setEnabled(false);
        LinearSortRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinearSortRTActionPerformed(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(0, 204, 255));
        SearchButton.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        RunTimeLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        RunTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        RunTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RunTimeLabel.setText("Run Time");

        ArrayShow.setColumns(20);
        ArrayShow.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        ArrayShow.setRows(5);
        ArrayShow.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ArrayShow.setEnabled(false);
        show.setViewportView(ArrayShow);

        Value.setBackground(new java.awt.Color(204, 204, 204));
        Value.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValueActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(51, 255, 51));
        Clear.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 51, 51));
        Exit.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appLayout = new javax.swing.GroupLayout(app);
        app.setLayout(appLayout);
        appLayout.setHorizontalGroup(
            appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(Topic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(appLayout.createSequentialGroup()
                .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appLayout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(appLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(appLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(EnterValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appLayout.createSequentialGroup()
                .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InterpolationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(appLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(RunTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(InterpolationRT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BinarySearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BinarySortRT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JumpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JumpSortRT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LinearSortRT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LinearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        appLayout.setVerticalGroup(
            appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Topic, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BinarySearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JumpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InterpolationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LinearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InterpolationRT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BinarySortRT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JumpSortRT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LinearSortRT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RunTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(app, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(app, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        int YesOrNo = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
        if (YesOrNo == 0) {
            dispose();
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        int YesOrNo = JOptionPane.showConfirmDialog(null,"Are you sure you want to clear run times?","Clear",JOptionPane.YES_NO_OPTION);
        if (YesOrNo == 0) {
            InterpolationRT.setText("");
            LinearSortRT.setText("");
            BinarySortRT.setText("");
            JumpSortRT.setText("");
            ArrayShow.setText("");
            Value.setText("");
        }
    }//GEN-LAST:event_ClearActionPerformed

    private void ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueActionPerformed

    }//GEN-LAST:event_ValueActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        int Size=10000;
        int searchElement = -1;
        int[] Array = new int[Size];
        Random rand = new Random(); 
        for(int i=0; i<Array.length; i++)
        {
            Array[i]=rand.nextInt(10000);;
        }
        StringBuilder text = new StringBuilder();
        for(int j=0; j<Array.length ;j++)
        {
            text.append(Array[j]);
            if (j != Array.length - 1) 
                text.append(",");
        }
        ArrayShow.setText(text.toString());
        if(Value.getText().equals("")) {
            final JPanel panelSearch = new JPanel();
            JOptionPane.showMessageDialog(panelSearch, "Enter the value of search element", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else 
        {
            searchElement = Integer.parseInt(Value.getText());
        }
        linearSearch(Array,searchElement);
        jumpSearch(Array,searchElement);
        BinarySearch(Array,searchElement);
        InterpolationSearch(Array,searchElement);
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void LinearSortRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinearSortRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LinearSortRTActionPerformed

    private void JumpSortRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumpSortRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumpSortRTActionPerformed

    private void BinarySortRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinarySortRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BinarySortRTActionPerformed

    private void InterpolationRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterpolationRTActionPerformed
        // TODO add your handling code hezdc zre:
    }//GEN-LAST:event_InterpolationRTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            //int Size=5; 
           // int[] Array = new int[]{ 1,2,3,4,5}; 
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SortingAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingAssignment().setVisible(true);
            }
        }); 
    }

    public void linearSearch(int Array[],int searchElement)
    { 
        int flag=0,index=-1;
        long LinearSearchStartTime = System.nanoTime();
        for(int i=0; i<Array.length; i++)
        {
            if(Array[i]==searchElement)
            {
                flag=1;
                index=i;
                JOptionPane.showMessageDialog(null, "Element found at index(without sort) :" + index , "Search Found in Linear Search" , JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        if(flag==0)
        {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Could not find the element in array", "Error", JOptionPane.ERROR_MESSAGE);
        }
        long LinearSearchFinishTime = System.nanoTime();
        long LinearSearchTime = LinearSearchFinishTime - LinearSearchStartTime;
        String LinearSearchTimeStr = Long.toString(LinearSearchTime);
        LinearSortRT.setText(LinearSearchTimeStr);
    }
    
    public void jumpSearch(int Array[],int searchElement)
    { 
        Arrays.sort(Array);
        int index=0, flag=0;
        int blockSize = (int)Math.floor(Math.sqrt(Array.length));
        long jumpSearchStartTime = System.nanoTime();
        while(Array[blockSize-1]<searchElement)
        {
            index=blockSize-1;
            if(index>=Array.length)
            {
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel, "Something is wrong", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            blockSize+=(int)Math.floor(Math.sqrt(Array.length));
            if(blockSize>Array.length)
                blockSize=Array.length;
        }
        while(Array[index]<=searchElement && index<=blockSize-1)
        {
            if(Array[index]==searchElement)
            {
                flag=1;
                JOptionPane.showMessageDialog(null, "Element found in jump search at index :" + index , "Search Found" , JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            index++;
        }
        if(flag==0)
        {
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Could not find the element in array", "Error", JOptionPane.ERROR_MESSAGE);
        }
        long jumpSearchFinishTime = System.nanoTime();
        long jumpSearchTime = jumpSearchFinishTime - jumpSearchStartTime;
        String jumpSearchTimeStr = Long.toString(jumpSearchTime);
        JumpSortRT.setText(jumpSearchTimeStr);
    }
    
    public void BinarySearch(int Array[],int searchElement)
    { 
        Arrays.sort(Array);
        long BinarySearchStartTime = System.nanoTime();
        int start = 0, finish=Array.length-1,index=-1;
        while(start<=finish && searchElement<=Array[finish] && searchElement>=Array[start])
        {
            int middle = start+((finish-start)/2);
            if(Array[middle]==searchElement)
            {
                index=middle;
                //JOptionPane.showMessageDialog(null, "Element found in binary search at index(after sort) :" + index , "Search Found" , JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            else if (searchElement<Array[middle])
                finish=middle-1;
            else 
                start=middle+1;
        }
        long BinarySearchFinishTime = System.nanoTime();
        long BinarySearchTime = BinarySearchFinishTime - BinarySearchStartTime;
        String BinarySearchTimeStr = Long.toString(BinarySearchTime);
        BinarySortRT.setText(BinarySearchTimeStr);
    }
    
    public void InterpolationSearch(int Array[],int searchElement)
    { 
        Arrays.sort(Array);
        long InterpolationSearchStartTime = System.nanoTime();
        int start = 0, finish=Array.length-1;
        while(start<=finish && searchElement<=Array[finish] && searchElement>=Array[start])
        {
            int position = (int) (start+(((double)(finish-start)/(Array[finish]-Array[start]))*(searchElement-Array[start])));
            if(Array[position]==searchElement)
                break;
            else if (searchElement>Array[position])
                start=position+1;
            else
                finish=position-1;
        }
        long InterpolationSearchFinishTime = System.nanoTime();
        long InterpolationSearchTime = InterpolationSearchFinishTime - InterpolationSearchStartTime;
        String InterpolationSearchTimeStr = Long.toString(InterpolationSearchTime);
        InterpolationRT.setText(InterpolationSearchTimeStr);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ArrayShow;
    private javax.swing.JLabel BinarySearchLabel;
    private javax.swing.JTextField BinarySortRT;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel EnterValueLabel;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel InterpolationLabel;
    private javax.swing.JTextField InterpolationRT;
    private javax.swing.JLabel JumpLabel;
    private javax.swing.JTextField JumpSortRT;
    private javax.swing.JLabel LinearLabel;
    private javax.swing.JTextField LinearSortRT;
    private javax.swing.JLabel RunTimeLabel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel Topic;
    private javax.swing.JTextField Value;
    private javax.swing.JPanel app;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane show;
    // End of variables declaration//GEN-END:variables
}