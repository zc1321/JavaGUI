import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.DefaultAdaptiveRuntimeFullScreenStrategy;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
public class medio{
       /** private static void sizeWindowOnScreen(JFrame medio, double widthRate, double heightRate)
        {
            //int screenResolution=Toolkit.getDefaultToolkit().getScreenResolution();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            medio.setSize(new Dimension((int)(screenSize.width * widthRate),(int)(screenSize.height *heightRate)));
        }**/
        private static EmbeddedMediaPlayerComponent mediaPlayerComponent1;
        private static EmbeddedMediaPlayerComponent mediaPlayerComponent;
        private static JPanel panel1;
       public static void main(String[] args) throws Exception{
            JFrame frame = new JFrame("视频");
            frame.setSize(1450, 800);
            frame.setLayout(new BorderLayout());
            Font font = new Font("幼圆",Font.BOLD,20);
            UIManager.put("Button.font",font);
            UIManager.put("ToggleButton.font",font);
            UIManager.put("RadioButton.font",font);
            UIManager.put("CheckBox.font",font);
            UIManager.put("ColorChooser.font",font);
            UIManager.put("ToggleButton.font",font);
            UIManager.put("ComboBox.font",font);
            UIManager.put("ComboBoxItem.font",font);
            UIManager.put("InternalFrame.titleFont",font);
            UIManager.put("Label.font",font);
            UIManager.put("List.font",font);
            UIManager.put("MenuBar.font",font);
            UIManager.put("Menu.font",font);
            UIManager.put("MenuItem.font",font);
            UIManager.put("RadioButtonMenuItem.font",font);
            UIManager.put("CheckBoxMenuItem.font",font);
            UIManager.put("PopupMenu.font",font);
            UIManager.put("OptionPane.font",font);
            UIManager.put("OptionPane.messageFont",font);
            UIManager.put("OptionPane.buttonFont",font);
            UIManager.put("Panel.font",font);
            UIManager.put("ProgressBar.font",font);
            UIManager.put("ScrollPane.font",font);
            UIManager.put("Viewport",font);
            UIManager.put("TabbedPane.font",font);
            UIManager.put("TableHeader.font",font);
            UIManager.put("TextField.font",font);
            UIManager.put("PasswordFiled.font",font);
            UIManager.put("TextArea.font",font);
            UIManager.put("TextPane.font",font);
            UIManager.put("EditorPane.font",font);
            UIManager.put("TitledBorder.font",font);
            UIManager.put("ToolBar.font",font);
            UIManager.put("ToolTip.font",font);
            UIManager.put("Tree.font",font);
            UIManager.put("Table.font",font);
            frame.setLocationRelativeTo(null);
            frame.setUndecorated(true);
            JMenuBar menuBar = new JMenuBar();
           JMenu fileMenu = new JMenu("文件");
           JMenu editMenu = new JMenu("编辑");
           SimpleDateFormat simpleDateFormat=new SimpleDateFormat("                                                                                 yyyy年MM月dd日EEEE ");
           String time=simpleDateFormat.format(new Date());
                JLabel label2 = new JLabel();
                JLabel label = new JLabel(time);
                ImageIcon icon1=new ImageIcon("pricture/声音(sound)_爱给网_aigei_com.png");
                JButton button7=new JButton(icon1);
                button7.setContentAreaFilled(false);
               button7.setBorderPainted(false);
               button7.setVisible(true);
               ImageIcon icon2 = new ImageIcon("pricture/音量关闭(volume off)_爱给网_aigei_com.png");
               JButton button8 = new JButton(icon2);
               button8.setContentAreaFilled(false);
               button8.setBorderPainted(false);
               button8.setVisible(false);
               //JMenu formatMenu = new JMenu("格式");
               //JMenu checkMenu = new JMenu("查看");
               JMenu helpMenu = new JMenu("帮助");
               menuBar.add(fileMenu);
               menuBar.add(editMenu);
               //menuBar.add(formatMenu);
               // menuBar.add(checkMenu);
               menuBar.add(helpMenu);
               //menuBar.add(button7);
               //menuBar.add(button8);
               menuBar.add(label);
               //menuBar.setBackground(Color.PINK);
               frame.setJMenuBar(menuBar);
            //frame.setVisible(true);
        String URL1="media/p35515414-102-9987636-150425.mp4";
        mediaPlayerComponent1 =new EmbeddedMediaPlayerComponent() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 27) {
                    frame.setSize(1450, 800);
                    menuBar.setVisible(true);
                    panel1.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.repaint();
                }
                if (e.getKeyCode() == 32) {
                    mediaPlayerComponent1.getMediaPlayer().pause();
                }
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    //frame.getGraphicsConfiguration().getDevice().setFullScreenWindow(frame);
                    panel1.setVisible(false);
                    menuBar.setVisible(false);
                    frame.setLocationRelativeTo(null);
                }
                if (e.getClickCount() == 1) {
                    //int w=mediaPlayerComponent1.getMediaPlayer().getVideoDimension().width;
                    //int h=mediaPlayerComponent1.getMediaPlayer().getVideoDimension().height;
                    // frame.setSize(w,h);
                    frame.setSize(1450, 800);
                    panel1.setVisible(true);
                    menuBar.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.repaint();
                }
            }
        };
        mediaPlayerComponent=new EmbeddedMediaPlayerComponent(){
            @Override
            public void mousePressed(MouseEvent e) {
                Dimension dimension = new Dimension(400, 400);
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI("http://192.168.111.222:8080/mimi"));
                    dimension.setSize(dimension);
                } catch (IOException | URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        };
                JPanel contentPane = new JPanel();
                //contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            contentPane.setLayout(new

                BorderLayout());
            frame.setContentPane(contentPane);
                JPanel videopane = new JPanel();
                //JPanel panel=new JPanel();
            contentPane.add(videopane,BorderLayout.CENTER);
            ///contentPane.add(panel,BorderLayout.NORTH);
            //panel.setLayout(new BorderLayout());
            videopane.setLayout(new

                BorderLayout());
            videopane.add(mediaPlayerComponent);
                 panel1 = new JPanel();
            videopane.add(panel1,BorderLayout.SOUTH);
                JPanel buttonPane = new JPanel();
            //buttonPane.setBackground(Color.PINK);
            panel1.add(buttonPane);
            //panel1.setBackground(Color.PINK);
            panel1.setVisible(true);
                ImageIcon icon = new ImageIcon("pricture/th.jpg");
                // ImageIcon icon1=new ImageIcon("pricture/QQ图片20220619203827.png");
                JLabel label1 = new JLabel(icon);
                //JLabel label1=new JLabel(icon1);
                ImageIcon icon3=new ImageIcon("pricture/播放暂停_爱给网_aigei_com.png");
                ImageIcon icon4=new ImageIcon("pricture/循环播放_32_爱给网_aigei_com.png");
                ImageIcon icon5=new ImageIcon("pricture/播放-暂停(play-pause)_爱给网_aigei_com.png");
                ImageIcon icon6=new ImageIcon("pricture/退出注销(exit log out)_爱给网_aigei_com.png");
                ImageIcon icon7=new ImageIcon("pricture/复古文件夹图标下载10_爱给网_aigei_com.png");
                ImageIcon icon8=new ImageIcon("pricture/mp_爱给网_aigei_com.png");
                JButton button = new JButton(icon8);
                button.setBorderPainted(false);
                button.setContentAreaFilled(false);
                JButton button1 = new JButton(icon3);
                button1.setBorderPainted(false);
                button1.setContentAreaFilled(false);
                JButton button2 = new JButton(icon5);
                button2.setBorderPainted(false);
                button2.setContentAreaFilled(false);
                JButton button3 = new JButton(icon7);
                button3.setBorderPainted(false);
                button3.setContentAreaFilled(false);
                JButton button4 = new JButton(icon4);
                button4.setBorderPainted(false);
                button4.setContentAreaFilled(false);
                JButton button5 = new JButton("返回");
                JButton button6=new JButton(icon6);
                button6.setBorderPainted(false);
                button6.setContentAreaFilled(false);
                JSlider slider = new JSlider();
                JLabel currentlabel = new JLabel();
                JLabel totallabel = new JLabel();
                slider.setValue(100);
            slider.setMaximum(120);
            slider.setForeground(Color.BLUE);
            slider.setBackground(Color.PINK);
            slider.setVisible(false);
            JProgressBar progressBar = new JProgressBar();
            button.setForeground(Color.blue);
            button1.setForeground(Color.blue);
            button2.setForeground(Color.blue);
            button3.setForeground(Color.blue);
            button4.setForeground(Color.blue);
            button5.setForeground(Color.blue);
            button6.setForeground(Color.red);
                //buttonPane.add(label1);
                //buttonPane.add(label);
                //buttonPane.add(btnStop);
            buttonPane.add(currentlabel);
            buttonPane.add(progressBar);
            buttonPane.add(totallabel);
            buttonPane.add(slider);
            progressBar.setBorderPainted(false);
            progressBar.setPreferredSize(new Dimension(400,20));
            progressBar.setForeground(Color.orange);
            progressBar.setBackground(Color.white);
            progressBar.setStringPainted(true);
            progressBar.setString("努力前进中");
            buttonPane.add(button1);
            buttonPane.add(button4);
            buttonPane.add(button2);
            buttonPane.add(button);
            buttonPane.add(button3);
            buttonPane.add(button5);
            buttonPane.add(button6);
                medio calculator = new medio();
                // sizeWindowOnScreen(frame,0.6,0.6);
                final AtomicBoolean pause = new AtomicBoolean(false);
                Thread playerThread = new Thread() {
                    @Override
                    public void run() {
                        while (true) {
                            File file = new File("music/新视频1.mp3");
                            try {
                                Player player = new Player(new FileInputStream(file));
                                try {
                                    while (player.play(1)) {
                                if (pause.get()) {
                                    LockSupport.park();
                                }
                            }
                        } catch (Exception e) {
                            System.err.printf("%s\n", e.getMessage());
                        }
                       } catch (JavaLayerException | FileNotFoundException e) {
                                throw new RuntimeException(e);
                            }
                            File file1 = new File("music/英雄联盟 - 不可阻挡 (Burn It All Down).mp3");
                            try {
                                Player player = new Player(new FileInputStream(file1));
                                try {
                                    while (player.play(1)) {
                                        if (pause.get()) {
                                            LockSupport.park();
                                        }
                                    }
                                } catch (Exception e) {
                                    System.err.printf("%s\n", e.getMessage());
                                }
                            } catch (JavaLayerException | FileNotFoundException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                };
             playerThread.start();
             button.addActionListener(new

                ActionListener() {
                    @Override
                    public void actionPerformed (ActionEvent e){
                   //button.addMouseListener(new MouseAdapter() {
                      // @Override
                       //public void mousePressed(MouseEvent e) {
                        //Scanner scanner = new Scanner(System.in);
                        //String s = null;
                        // while (!(s.int)) {
                        //f (s.isEmpty()) {
                        //pause.set(!pause.get());
                        // if (!pause.get()) {
                        //LockSupport.unpark(playerThread);
                        // }
                        // }
                        //}
                        //System.exit(0);
                        frame.requestFocus();
                        ImageIcon icon1 = new ImageIcon("pricture/WMP_爱给网_aigei_com.png");
                        JLabel label1 = new JLabel("选择视频");
                        label1.setFont(new Font("幼圆", Font.BOLD, 20));
                        Font font = new Font("幼圆", Font.BOLD, 20);
                        UIManager.put("ComboBox.font", font);
                        UIManager.put("Button.font", font);
                        Object[] c = {"Java之父独家专访", "起风了", "黑娃兄弟(搞笑视频)", "英雄联盟(直播)", "东星-耀扬(直播)"};
                        String name = String.valueOf(JOptionPane.showInputDialog(null, label1, "视频列表", JOptionPane.QUESTION_MESSAGE, icon1, c, c[0]));
                        if (name.equals("Java之父独家专访")) {
                            pause.set(!pause.get());//重点！！！！！
                            progressBar.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            button5.setVisible(true);
                            slider.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            //EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
                            videopane.add(mediaPlayerComponent1);
                            mediaPlayerComponent1.getMediaPlayer().playMedia("media/《Ticking Away 流光似箭》 __ 2023无畏契约全球冠军赛主题曲_网络游戏热门视频.webm");
                            mediaPlayerComponent1.getMediaPlayer().setRepeat(false);
                            mediaPlayerComponent.setVisible(false);
                            mediaPlayerComponent1.setVisible(true);
                            button7.setVisible(false);
                            button8.setVisible(false);
                            button.setVisible(false);
                            button3.setVisible(false);
                            fileMenu.setVisible(false);
                            //int w=mediaPlayerComponent1.getMediaPlayer().getVideoDimension().width;
                            //int h=mediaPlayerComponent1.getMediaPlayer().getVideoDimension().height;
                            //frame.setSize(w,h);
                            //frame.repaint();
                        }
                        if (name.equals("起风了")) {
                            pause.set(!pause.get());
                            progressBar.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            button5.setVisible(true);
                            slider.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            //EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
                            videopane.add(mediaPlayerComponent1);
                            mediaPlayerComponent1.getMediaPlayer().playMedia("media/c3aee261fdc3d872f710a2c0360434c5.mp4");
                            mediaPlayerComponent1.getMediaPlayer().setRepeat(false);
                            mediaPlayerComponent.setVisible(false);
                            mediaPlayerComponent1.setVisible(true);
                            button7.setVisible(false);
                            button8.setVisible(false);
                            button.setVisible(false);
                            button3.setVisible(false);
                            fileMenu.setVisible(false);
                        }
                        if (name.equals("黑娃兄弟(搞笑视频)")) {
                            pause.set(!pause.get());
                            progressBar.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            button5.setVisible(true);
                            slider.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            //EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
                            videopane.add(mediaPlayerComponent1);
                            mediaPlayerComponent1.getMediaPlayer().playMedia(URL1);
                            mediaPlayerComponent1.getMediaPlayer().setRepeat(false);
                            mediaPlayerComponent.setVisible(false);
                            mediaPlayerComponent1.setVisible(true);
                            button7.setVisible(false);
                            button8.setVisible(false);
                            button.setVisible(false);
                            button3.setVisible(false);
                            fileMenu.setVisible(false);
                        }
                        if (name.equals("英雄联盟(直播)")) {
                            pause.set(!pause.get());
                            progressBar.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            button5.setVisible(true);
                            slider.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                           // EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
                            videopane.add(mediaPlayerComponent1);
                            mediaPlayerComponent1.getMediaPlayer().playMedia("https://d1--cn-gotcha208.bilivideo.com/live-bvc/167882/live_50329118_9516950_2500/index.m3u8?expires=1658581441&len=0&oi=1991769495&pt=web&qn=0&trid=100725fee73eee7b44e5864958e3333f3b88&sigparams=cdn,expires,len,oi,pt,qn,trid&cdn=cn-gotcha208&sign=3732d5d5180164bcd44543fe6a27ce2a&sk=c9c6154426932efa80d25af02e87a3bd&p2p_type=1&src=57601&sl=10&free_type=0&pp=rtmp&machinezone=ylf&source=onetier&site=fb16d711ba09724c61e48c38a4d5eadf&order=1");
                            mediaPlayerComponent1.getMediaPlayer().setRepeat(false);
                            mediaPlayerComponent.setVisible(false);
                            mediaPlayerComponent1.setVisible(true);
                            button7.setVisible(false);
                            button8.setVisible(false);
                            button.setVisible(false);
                            button3.setVisible(false);
                            fileMenu.setVisible(false);
                        }
                        if (name.equals("东星-耀扬(直播)")) {
                            pause.set(!pause.get());
                            progressBar.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            button5.setVisible(true);
                            slider.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            videopane.add(mediaPlayerComponent1);
                           // EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
                           // mediaPlayerComponent1.getMediaPlayer().playMedia("http://ws.flv.huya.com/src/1279521053571-1279521053571-16818089739172184064-2559042230598-10057-A-0-1-imgplus.flv?wsSecret=0197e94a601004eec178b51631bccfd3&wsTime=62e7e053&fm=RFdxOEJjSjNoNkRKdDZUWV8kMF8kMV8kMl8kMw%3D%3D&ctype=huya_live&fs=bgct&sphdcdn=al_7-tx_3-js_3-ws_7-bd_2-hw_2&sphdDC=huya&sphd=264_*-265_*");
                            mediaPlayerComponent1.getMediaPlayer().playMedia("media/791342107-1-208.mp4");
                            mediaPlayerComponent1.getMediaPlayer().setRepeat(false);
                            mediaPlayerComponent.setVisible(false);
                            mediaPlayerComponent1.setVisible(true);
                            button7.setVisible(false);
                            button8.setVisible(false);
                            button.setVisible(false);
                            button3.setVisible(false);
                            fileMenu.setVisible(false);
                        }
                    }
                });
            //button1.addActionListener(new

                //ActionListener() {
                   // @Override
                   // public void actionPerformed (ActionEvent e){
              button1.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      frame.requestFocus();
                      mediaPlayerComponent1.getMediaPlayer().start();
                  }
              });
            button2.addActionListener(new
                ActionListener() {
                    @Override
                    public void actionPerformed (ActionEvent e){
                        frame.requestFocus();
                        mediaPlayerComponent1.getMediaPlayer().pause();
                    }
                });
            button3.addActionListener(new ActionListener() {
                    @Override
                   public void actionPerformed (ActionEvent e){
                 //button3.addMouseListener(new EmbeddedMediaPlayerComponent() {
                     //@Override
                    // public void mousePressed(MouseEvent e) {
                         frame.requestFocus();
                        JFileChooser fileChooser = new JFileChooser();
                        Font font = new Font("幼圆", Font.BOLD, 20);
                        UIManager.put("FileChooser.Font", font);
                        int v = fileChooser.showOpenDialog(null);
                        if (v == JFileChooser.APPROVE_OPTION) {
                            pause.set(!pause.get());
                            progressBar.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            button5.setVisible(true);
                            slider.setVisible(true);
                            currentlabel.setVisible(true);
                            totallabel.setVisible(true);
                            File file = fileChooser.getSelectedFile();
                            //EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
                            videopane.add(mediaPlayerComponent1);
                            mediaPlayerComponent1.getMediaPlayer().playMedia(file.getAbsolutePath());
                            mediaPlayerComponent1.getMediaPlayer().setRepeat(false);
                            mediaPlayerComponent.setVisible(false);
                            mediaPlayerComponent1.setVisible(true);
                            button7.setVisible(false);
                            button8.setVisible(false);
                            button.setVisible(false);
                            button3.setVisible(false);
                            fileMenu.setVisible(false);
                        }
                    }
                });
            new SwingWorker<String, Integer>()

                {
                    @Override
                    protected String doInBackground () throws Exception {
                    while (true) {
                        //EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
                        long total = mediaPlayerComponent1.getMediaPlayer().getLength();
                        long curr = mediaPlayerComponent1.getMediaPlayer().getTime();
                        //long seconds=(curr/1000)%60;
                        //long minutes=((curr-seconds)/1000)/60;
                        long hours = curr / 1000 / 60 / 60;
                        long minutes = curr / 1000 / 60 % 60;
                        long seconds = curr / 1000 % 60;
                        currentlabel.setText(hours + ":" + minutes + ":" + seconds);
                        //long seconds1=(total/1000)%60;
                        // long minutes1=((total-seconds1)/1000)/60;
                        long hours1 = total / 1000 / 60 / 60;
                        long minutes1 = total / 1000 / 60 % 60;
                        long seconds1 = total / 1000 % 60;
                        totallabel.setText(hours1 + ":" + minutes1 + ":" + seconds1);
                        float percent = (float) curr / total;
                        publish((int) (percent * 100));
                        Thread.sleep(100);
                    }
                }

                    protected void process (java.util.List < Integer > chunks) {
                    for (int v : chunks) {
                        progressBar.setValue(v);
                    }
                };
                }.
                execute();
            progressBar.addMouseListener(new

                MouseAdapter() {
                    @Override
                    public void mouseClicked (MouseEvent e) {
                            int x = e.getX();
                            float a = (float) x / progressBar.getWidth();
                            mediaPlayerComponent1.getMediaPlayer().setTime((long) (a * mediaPlayerComponent1.getMediaPlayer().getLength()));
                        }
                });
            slider.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged (ChangeEvent e){
                        int v = slider.getValue();
                        mediaPlayerComponent1.getMediaPlayer().setVolume(v);
                    }
                });
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    mediaPlayerComponent1.getMediaPlayer().setRepeat(true);
                }
            });
            button5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed (ActionEvent e) {
                        frame.requestFocus();
                        //pause.set(!pause.get());
                        //LockSupport.unpark(playerThread);
                        button5.setVisible(false);
                        progressBar.setVisible(false);
                        slider.setVisible(false);
                        currentlabel.setVisible(false);
                        totallabel.setVisible(false);
                        //将第二个视频中的原有播放项目改为指定的无音频的MP4。
                        mediaPlayerComponent1.getMediaPlayer().playMedia("media/4L3ReXdxC5HLRHeCOe5.mp4");
                        mediaPlayerComponent1.getMediaPlayer().setRepeat(true);
                        mediaPlayerComponent.setVisible(true);
                        mediaPlayerComponent1.setVisible(false);
                        button3.setVisible(true);
                        button.setVisible(true);
                        fileMenu.setVisible(true);
                        if(!pause.get()){
                            button8.setVisible(true);
                            pause.set(!pause.get());
                            LockSupport.unpark(playerThread);
                        }
                        else{
                            button7.setVisible(true);
                            pause.set(!pause.get());
                            LockSupport.unpark(playerThread);
                        }
                    }
            });
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pause.set(!pause.get());
                    frame.dispose();
                    mediaPlayerComponent1.getMediaPlayer().stop();
                    System.exit(0);
                }
            });
            frame.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode()==27){
                        frame.setSize(1450,800);
                        menuBar.setVisible(true);
                        panel1.setVisible(true);
                        frame.setLocationRelativeTo(null);
                        frame.repaint();
                    }
                    if(e.getKeyCode()==32){
                        mediaPlayerComponent1.getMediaPlayer().pause();
                        //mediaPlayerComponent.getMediaPlayer().pause();
                    }
                }
                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        //fileMenu.addActionListener(new ActionListener() {
           // @Override
            ///public void actionPerformed(ActionEvent e) {
        fileMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                frame.requestFocus();
                JFileChooser fileChooser = new JFileChooser();
                Font font = new Font("幼圆", Font.BOLD, 20);
                UIManager.put("FileChooser.Font", font);
                int v = fileChooser.showOpenDialog(null);
                if (v == JFileChooser.APPROVE_OPTION) {
                    pause.set(!pause.get());
                    progressBar.setVisible(true);
                    currentlabel.setVisible(true);
                    totallabel.setVisible(true);
                    button5.setVisible(true);
                    slider.setVisible(true);
                    currentlabel.setVisible(true);
                    totallabel.setVisible(true);
                    File file = fileChooser.getSelectedFile();
                    //EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
                    videopane.add(mediaPlayerComponent1);
                    mediaPlayerComponent1.getMediaPlayer().playMedia(file.getAbsolutePath());
                    mediaPlayerComponent1.getMediaPlayer().setRepeat(false);
                    mediaPlayerComponent.setVisible(false);
                    mediaPlayerComponent1.setVisible(true);
                    button.setVisible(false);
                    button7.setVisible(false);
                    button8.setVisible(false);
                    button3.setVisible(false);
                    fileMenu.setVisible(false);
                }
            }
        });
        editMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JFrame frame1=new JFrame("文本");
                frame1.setSize(500,500);
                frame1.setVisible(true);
                frame1.setLocationRelativeTo(null);
                frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                JTextArea textArea = new JTextArea();
                scrollPane.setViewportView(textArea);
                frame1.getContentPane().add(scrollPane);
            }
        });
        helpMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JFrame frame1=new JFrame("帮助");
                frame1.setSize(380,170);
                frame1.setLayout(new FlowLayout());
                frame1.setVisible(true);
                frame1.setLocationRelativeTo(null);
                frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ImageIcon icon1=new ImageIcon("pricture/QQ图片20220619203827.png");
                JLabel label1=new JLabel(icon1);
                JTextArea textArea = new JTextArea("esc/鼠标单击:退出全屏;\r\n鼠标双击:进入全屏;\r\n空格:视频暂停;\r\n红色按钮:结束程序;\r\n有问题加QQ:2370864048");
                frame1.getContentPane().add(textArea,0);
                frame1.getContentPane().add(label1,-1);
            }
        });
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                    button7.setVisible(false);
                    button8.setVisible(true);
                    pause.set(!pause.get());//关闭背景音乐
            }
        });
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                   button8.setVisible(false);
                   button7.setVisible(true);
                   pause.set(!pause.get());
                   LockSupport.unpark(playerThread);//开启背景音乐
            }
        });
            frame.setVisible(true);
            frame.requestFocus();
            //String URL="media/4L3ReXdxC5HLRHeCOe5.mp4";
            mediaPlayerComponent.getMediaPlayer().playMedia("media/hero.mp4");
            mediaPlayerComponent.getMediaPlayer().setRepeat(true);
            // mediaPlayerComponent1.getMediaPlayer().toggleFullScreen();
            progressBar.setVisible(false);
            currentlabel.setVisible(false);
            totallabel.setVisible(false);
            button5.setVisible(false);
        new Thread(()-> {
            while(true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //Calendar calendar = Calendar.getInstance();
                //int hour = calendar.get(Calendar.HOUR);
                //int minute = calendar.get(Calendar.MINUTE);
                //int second = calendar.get(Calendar.SECOND);
                //String time1 = hour + ":" + minute + ":" + second;
                SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("HH:mm:ss");
                String time1=simpleDateFormat1.format(new Date());
                label2.setText(" 时间:"+time1);
                menuBar.add(label2);
                menuBar.add(button7);
                menuBar.add(button8);
                frame.setJMenuBar(menuBar);
            }
        }).start();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
    }
