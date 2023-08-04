/********************************************************************************
 ** Form generated from reading ui file 'frmIncial.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class frmInicial implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionEntrenamiento;
    public QAction actionSalir;
    public QWidget centralwidget;
    public QFrame frame;
    public QLabel logo_lateral;
    public QFrame frame_2;
    public QLabel nombreApp;
    public QPushButton btnEntrenamiento;
    public QPushButton btnSalir;
    public QMenuBar menubar;
    public QMenu menuEntrenamiento;
    public QStatusBar statusbar;

    public frmInicial() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(800, 600).expandedTo(MainWindow.minimumSizeHint()));
        MainWindow.setMinimumSize(new QSize(800, 600));
        MainWindow.setMaximumSize(new QSize(800, 600));
        actionEntrenamiento = new QAction(MainWindow);
        actionEntrenamiento.setObjectName("actionEntrenamiento");
        actionSalir = new QAction(MainWindow);
        actionSalir.setObjectName("actionSalir");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        frame = new QFrame(centralwidget);
        frame.setObjectName("frame");
        frame.setGeometry(new QRect(0, 0, 300, 600));
        frame.setMinimumSize(new QSize(300, 600));
        frame.setMaximumSize(new QSize(300, 600));
        frame.setStyleSheet("background-color: rgb(0, 0, 127)");
        frame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        logo_lateral = new QLabel(frame);
        logo_lateral.setObjectName("logo_lateral");
        logo_lateral.setGeometry(new QRect(20, 20, 250, 500));
        logo_lateral.setMinimumSize(new QSize(250, 500));
        logo_lateral.setMaximumSize(new QSize(250, 500));
        logo_lateral.setPixmap(new QPixmap(("resources/img_logo.png")));
        logo_lateral.setScaledContents(true);
        frame_2 = new QFrame(centralwidget);
        frame_2.setObjectName("frame_2");
        frame_2.setGeometry(new QRect(300, 0, 500, 600));
        frame_2.setMinimumSize(new QSize(500, 600));
        frame_2.setMaximumSize(new QSize(500, 600));
        frame_2.setStyleSheet("background-color: rgb(0, 170, 255)");
        frame_2.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame_2.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        nombreApp = new QLabel(frame_2);
        nombreApp.setObjectName("nombreApp");
        nombreApp.setGeometry(new QRect(0, 10, 501, 101));
        QFont font = new QFont();
        font.setFamily("Comic Sans MS");
        font.setPointSize(20);
        font.setBold(true);
        font.setWeight(75);
        nombreApp.setFont(font);
        nombreApp.setTextFormat(com.trolltech.qt.core.Qt.TextFormat.RichText);
        nombreApp.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        btnEntrenamiento = new QPushButton(frame_2);
        btnEntrenamiento.setObjectName("btnEntrenamiento");
        btnEntrenamiento.setGeometry(new QRect(80, 240, 361, 71));
        QFont font1 = new QFont();
        font1.setFamily("Comic Sans MS");
        font1.setPointSize(14);
        font1.setBold(true);
        font1.setWeight(75);
        btnEntrenamiento.setFont(font1);
        btnEntrenamiento.setCursor(new QCursor(Qt.CursorShape.OpenHandCursor));
        btnEntrenamiento.setStyleSheet("background-color: rgb(0, 0, 127);\n"+
"color: rgb(255,255,255);\n"+
"border-radius: 25px;\n"+
"border-style: solid;\n"+
"border_width:5px;\n"+
"border-color:rgb(255,255,255);");
        btnSalir = new QPushButton(frame_2);
        btnSalir.setObjectName("btnSalir");
        btnSalir.setGeometry(new QRect(80, 390, 361, 71));
        QFont font2 = new QFont();
        font2.setFamily("Comic Sans MS");
        font2.setPointSize(14);
        font2.setBold(true);
        font2.setWeight(75);
        btnSalir.setFont(font2);
        btnSalir.setCursor(new QCursor(Qt.CursorShape.OpenHandCursor));
        btnSalir.setStyleSheet("background-color: rgb(0, 0, 127);\n"+
"color: rgb(255,255,255);\n"+
"border-radius: 25px;\n"+
"border-style: solid;\n"+
"border_width:5px;\n"+
"border-color:rgb(255,255,255);");
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 800, 31));
        menuEntrenamiento = new QMenu(menubar);
        menuEntrenamiento.setObjectName("menuEntrenamiento");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuEntrenamiento.menuAction());
        menuEntrenamiento.addAction(actionEntrenamiento);
        menuEntrenamiento.addAction(actionSalir);
        retranslateUi(MainWindow);
        actionSalir.triggered.connect(MainWindow, "disposeLater()");
        btnSalir.clicked.connect(MainWindow, "close()");

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        actionEntrenamiento.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "&Nuevo Entrenamiento", null));
        actionSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "&Salir", null));
        logo_lateral.setText("");
        nombreApp.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "<html><head/><body><p><span style=\" color:#ffffff;\">Gimnasio Al-Andalus</span></p></body></html>", null));
        btnEntrenamiento.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Pulse para registrar un nuevo entrenamiento", null));
        btnEntrenamiento.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nuevo Entrenamiento", null));
        btnSalir.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Pulse para salir de la aplicaci\u00f3n.", null));
        btnSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir", null));
        menuEntrenamiento.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Entrenamiento", null));
    } // retranslateUi

}

