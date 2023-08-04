/**
 * ******************************************************************************
 ** Form generated from reading ui file 'frmEntrena.jui' * * Created by: Qt
 * User Interface Compiler version 4.8.7 * * WARNING! All changes made in this
 * file will be lost when recompiling ui file!
 * ******************************************************************************
 */
package tarea2.azm;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class frmEntrena implements com.trolltech.qt.QUiForm<QDialog> {

    public QFrame frame;
    public QLabel logoApp;
    public QLabel label;
    public QLabel label_2;
    public QFrame frame_2;
    public QLabel logoRegistro;
    public QLabel txtRegistro;
    public QLabel txtDataTrain;
    public QLabel txtDataTypeTrain;
    public QLabel txtPayForm;
    public QFrame line;
    public QLabel txtCodigo;
    public QLabel txtInstructor;
    public QLabel txtEntrenamiento;
    public QLabel txtTelf;
    public QLabel txtFecha;
    public QDateEdit dateEdit;
    public QFrame line_2;
    public QWidget gridLayoutWidget;
    public QGridLayout gridTypeTrain;
    public QRadioButton rbFuncional;
    public QRadioButton rbCrossfit;
    public QRadioButton rbMuscular;
    public QRadioButton rbFuerza;
    public QRadioButton rbRunning;
    public QRadioButton rbFisico;
    public QWidget horizontalLayoutWidget;
    public QHBoxLayout layoutZonaTrabajo;
    public QCheckBox cbSuperior;
    public QCheckBox cbInferior;
    public QCheckBox cbTronco;
    public QCheckBox cbCore;
    public QLabel txtZonaTrabajo;
    public QFrame line_3;
    public QLabel txtSalas;
    public QWidget gridLayoutWidget_2;
    public QGridLayout gridMaquinas;
    public QCheckBox cbBici;
    public QCheckBox cbCinta;
    public QCheckBox cbPlacas;
    public QCheckBox cbPalancas;
    public QCheckBox cbMultifuncion;
    public QCheckBox cbBancos;
    public QWidget horizontalLayoutWidget_2;
    public QHBoxLayout horizontalLayout;
    public QRadioButton rbFitness;
    public QRadioButton rbCross;
    public QRadioButton rbMusculacion;
    public QLabel txtMaquinas;
    public QFrame line_4;
    public QWidget horizontalLayoutWidget_3;
    public QHBoxLayout horizontalLayout_2;
    public QRadioButton rbSesion;
    public QRadioButton rbBono;
    public QRadioButton rbMensual;
    public QLabel txtCantidadSesiones;
    public QFrame line_5;
    public QSpinBox spnCantidadSesiones;
    public QLabel txtPrice;
    public QLabel txtSymbolMoney;
    public QPushButton btnSalir;
    public QPushButton btnSave;
    public QPushButton btnClean;
    public QLineEdit etCodigo;
    public QLineEdit etInstructor;
    public QLineEdit etEntrenamiento;
    public QLineEdit etTelefono;
    public QLineEdit etPrice;

    public QDialog dialogo;

    public frmEntrena() {
        super();
    }

    public void verifyDataForm() {

        QMessageBox qmb = new QMessageBox();
        boolean dataValid = false;

        String fechaString = dateEdit.text();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(date);

        if (etCodigo.text().isEmpty()) {
            dataValid = false;
        } else if (etInstructor.text().isEmpty()) {
            dataValid = false;
        } else if (etEntrenamiento.text().isEmpty()) {
            dataValid = false;
        } else if (etTelefono.text().isEmpty()) {
            dataValid = false;
        } else if (etPrice.text().isEmpty() || etPrice.text().equals("0.00")) {
            dataValid = false;

        } else if (!rbMuscular.isChecked() && !rbFuncional.isChecked() && !rbCrossfit.isChecked()
                && !rbFuerza.isChecked() && !rbRunning.isChecked() && !rbFisico.isChecked()) {
            dataValid = false;

        } else if (rbMuscular.isChecked() && (!cbSuperior.isChecked() && !cbInferior.isChecked()
                && !cbCore.isChecked() && !cbTronco.isChecked())) {
            dataValid = false;

        } else if (rbFisico.isChecked() && (!cbSuperior.isChecked() && !cbInferior.isChecked()
                && !cbCore.isChecked() && !cbTronco.isChecked())) {
            dataValid = false;

        } else if (!rbFitness.isChecked() && !rbCross.isChecked() && !rbMusculacion.isChecked()) {
            dataValid = false;

        } else if (rbFitness.isChecked() && (!cbCinta.isChecked() && !cbBici.isChecked()
                && !cbMultifuncion.isChecked() && !cbPalancas.isChecked()
                && !cbPlacas.isChecked() && !cbBancos.isChecked())) {
            dataValid = false;

        } else if (rbCross.isChecked() && (!cbPalancas.isChecked()
                && !cbPlacas.isChecked())) {
            dataValid = false;

        } else if (rbMusculacion.isChecked() && (!cbMultifuncion.isChecked()
                && !cbBancos.isChecked())) {
            dataValid = false;

        } else if (!rbSesion.isChecked() && !rbBono.isChecked() && !rbMensual.isChecked()) {
            dataValid = false;

        } else if (!fechaString.equals(fecha)) {
            dataValid = false;

        } else {
            dataValid = true;
        }

        int report;
        if (dataValid) {
            report = JOptionPane.showConfirmDialog(null, report(), "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (report == 0) {
                qmb.information(dialogo, "Registro", "Registro guardado con éxito.");
                resetData();
                btnSalir.click();
            }

        } else {
            JOptionPane.showMessageDialog(null, dataError());
//            qmb.information(dialogo, "Error registro", sb.toString());
        }

    }

    private String dataError() {

        String fechaString = dateEdit.text();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(date);
        StringBuilder sb = new StringBuilder();

        if (etCodigo.text().isEmpty()) {
            sb.append("Introduzaca el código de registro.\n");
        }
        if (etInstructor.text().isEmpty()) {
            sb.append("Introduzaca el nombre del Instructor.\n");
        }
        if (etEntrenamiento.text().isEmpty()) {
            sb.append("Introduzaca el nombre del entrenamiemto.\n");
        }
        if (etTelefono.text().isEmpty()) {
            sb.append("Introduzca el teléfono del cliente.\n");
        }
        if (etPrice.text().isEmpty() || etPrice.text().equals("0.00")) {
            sb.append("Introduzaca el precio del entrenamiento.\n");
        }
        if (!rbMuscular.isChecked() && !rbFuncional.isChecked() && !rbCrossfit.isChecked()
                && !rbFuerza.isChecked() && !rbRunning.isChecked() && !rbFisico.isChecked()) {
            sb.append("Seleccione tipo de entrenamiento.\n");
        }
        if (rbMuscular.isChecked() && (!cbSuperior.isChecked() && !cbInferior.isChecked()
                && !cbCore.isChecked() && !cbTronco.isChecked())) {
            sb.append("Seleccione zona de trabajo.\n");
        }
        if (rbFisico.isChecked() && (!cbSuperior.isChecked() && !cbInferior.isChecked()
                && !cbCore.isChecked() && !cbTronco.isChecked())) {
            sb.append("Seleccione zona de trabajo.\n");
        }
        if (!rbFitness.isChecked() && !rbCross.isChecked() && !rbMusculacion.isChecked()) {
            sb.append("Seleccione una sala de entrenamiento.\n");
        }
        if (rbFitness.isChecked() && (!cbCinta.isChecked() && !cbBici.isChecked()
                && !cbMultifuncion.isChecked() && !cbPalancas.isChecked()
                && !cbPlacas.isChecked() && !cbBancos.isChecked())) {
            sb.append("Seleccione las máquinas de entrenamiento necesarias que desea usar en la sala de Fitness.\n");
        }
        if (rbCross.isChecked() && (!cbPalancas.isChecked()
                && !cbPlacas.isChecked())) {
            sb.append("Seleccione las máquinas de entrenamiento necesarias que desea usar en la sala de Cross.\n");
        }
        if (rbMusculacion.isChecked() && (!cbMultifuncion.isChecked()
                && !cbBancos.isChecked())) {
            sb.append("Seleccione las máquinas de entrenamiento necesarias que desea usar en la sala de Musculación.\n");
        }
        if (!rbSesion.isChecked() && !rbBono.isChecked() && !rbMensual.isChecked()) {
            sb.append("Seleccione la forma de pago.\n");
        }
        if (!fechaString.equals(fecha)) {
            sb.append("Introduzca fecha válida.\n");
        }
        
        /**
         * La comprobación de los precios me da error aunque no acabo de ver la razón.
         */

//        double precioMaxSesion = 99.99;
//        double precioMaxBonoMensual = 999.99;
//        int precio = Integer.parseInt(etPrice.text());
//        if (precio > precioMaxSesion && rbSesion.isChecked()) {
//            sb.append("El precio total por sesiones no puede superar el importe de 99.99€\n");
//        }
//        if (precio > precioMaxBonoMensual && (rbMensual.isChecked() || rbBono.isChecked())) {
//            sb.append("El precio total por Bono o Mensual no puede superar el importe de 999.99€\n");
//        }

        return sb.toString();
    }

    private void resetData() {
        etCodigo.setText("");
        etInstructor.setText("");
        etEntrenamiento.setText("");
        etTelefono.setText("");

        if (rbMuscular.isChecked()) {
            rbMuscular.setChecked(false);
        }
        if (rbFuncional.isChecked()) {
            rbFuncional.setChecked(false);
        }
        if (rbCrossfit.isChecked()) {
            rbCrossfit.setChecked(false);
        }
        if (rbFuerza.isChecked()) {
            rbFuerza.setChecked(false);
        }
        if (rbRunning.isChecked()) {
            rbRunning.setChecked(false);
        }
        if (rbFisico.isChecked()) {
            rbFisico.setChecked(false);
        }
        if (cbSuperior.isChecked()) {
            cbSuperior.setChecked(false);
        }
        if (cbInferior.isChecked()) {
            cbInferior.setChecked(false);
        }
        if (cbTronco.isChecked()) {
            cbTronco.setChecked(false);
        }
        if (cbCore.isChecked()) {
            cbCore.setChecked(false);
        }
        if (rbFitness.isChecked()) {
            rbFitness.setChecked(false);
        }
        if (rbCross.isChecked()) {
            rbCross.setChecked(false);
        }
        if (rbMusculacion.isChecked()) {
            rbMusculacion.setChecked(false);
        }
        if (cbCinta.isChecked()) {
            cbCinta.setChecked(false);
        }
        if (cbBici.isChecked()) {
            cbBici.setChecked(false);
        }
        if (cbPlacas.isChecked()) {
            cbPlacas.setChecked(false);
        }
        if (cbPalancas.isChecked()) {
            cbPalancas.setChecked(false);
        }
        if (cbMultifuncion.isChecked()) {
            cbMultifuncion.setChecked(false);
        }
        if (cbBancos.isChecked()) {
            cbBancos.setChecked(false);
        }
        if (rbSesion.isChecked()) {
            rbSesion.setChecked(false);
        }
        if (rbMensual.isChecked()) {
            rbMensual.setChecked(false);
        }
        if (rbBono.isChecked()) {
            rbBono.setChecked(false);
        }
        spnCantidadSesiones.setValue(2);
        etPrice.setText("0.00");

    }

    void resetPrice() {
        //En vez de limpiar el campo del precio por completo lo reseteamos a 0.00€
        etPrice.setText("0.00");
    }

    private String report() {
        String report;

        report = "Revise los datos introducidos en el formulario.\n";

        report += "\nDATOS ENTRENAMIENTO: ";
        report += "\nCódigo: " + etCodigo.text();
        report += "\nFecha registro: " + dateEdit.text();
        report += "\nNombre Instructor: " + etInstructor.text();
        report += "\nNombre entrenamiento: " + etEntrenamiento.text();
        report += "\nTeléfono: " + etTelefono.text();

        report += "\n\nTIPO ENTRENAMIENTO: ";
        if (rbMuscular.isChecked()) {
            report += "\nEntrenamiento Muscular: ";
        }
        if (rbFuncional.isChecked()) {
            report += "\nEntrenamiento Funcional: ";
        }
        if (rbCrossfit.isChecked()) {
            report += "\nEntrenamiento Crossfit: ";
        }
        if (rbFuerza.isChecked()) {
            report += "\nEntrenamiento Fuerza: ";
        }
        if (rbRunning.isChecked()) {
            report += "\nEntrenamiento Running: ";
        }
        if (rbFisico.isChecked()) {
            report += "\nEntrenamiento Fisico: ";
        }

        if (cbSuperior.isChecked()) {
            report += "\nZona entrenamiento Superior.";
        }
        if (cbInferior.isChecked()) {
            report += "\nZona entrenamiento Inferior.";
        }
        if (cbTronco.isChecked()) {
            report += "\nZona entrenamiento Tronco.";
        }
        if (cbCore.isChecked()) {
            report += "\nZona entrenamiento Core.";
        }

        report += "\n\nSALA ENTRENAMIENTO: ";
        if (rbFitness.isChecked()) {
            report += "\nSala entrenamiento Fitness:";
        }
        if (rbCross.isChecked()) {
            report += "\nSala entrenamiento Cross:";
        }
        if (rbMusculacion.isChecked()) {
            report += "\nSala entrenamiento Musculación:";
        }

        report += "\nSELECCIÓN DE MÁQUINAS DE ENTRENAMIENTO: ";
        if (cbCinta.isChecked()) {
            report += "\nCinta.";
        }
        if (cbBici.isChecked()) {
            report += "\nBicicleta.";
        }
        if (cbPlacas.isChecked()) {
            report += "\nPlacas.";
        }
        if (cbPalancas.isChecked()) {
            report += "\nPalancas.";
        }
        if (cbMultifuncion.isChecked()) {
            report += "\nMultifuncion.";
        }
        if (cbBancos.isChecked()) {
            report += "\nBancos.";
        }

        report += "\n\nFORME DE PAGO Y PRECIO: ";
        if (rbSesion.isChecked()) {
            report += "\nForma de pago por Sesiones.";
        }
        if (rbMensual.isChecked()) {
            report += "\nForma de pago Mensual";
        }
        if (rbBono.isChecked()) {
            report += "\nForma de pago Bono \n   Sesiones contratadas: " + spnCantidadSesiones.text();
        }

        report += "\nPrecio Total: " + etPrice.text() + " €";
        return report;
    }

    void saveData() {
        QMessageBox msgBox = new QMessageBox();
        msgBox.setIcon(QMessageBox.Icon.Information);
        msgBox.setText("Registro guardado");
        msgBox.exec();
    }

    void changeTrainSelectedOptions() {
        if (rbRunning.isChecked() && rbFuncional.isChecked() && rbCrossfit.isChecked()
                && rbFuerza.isChecked()) {
            cbSuperior.setChecked(false);
            cbInferior.setChecked(false);
            cbTronco.setChecked(false);
            cbCore.setChecked(false);
        } else {
            cbSuperior.setChecked(false);
            cbInferior.setChecked(false);
            cbTronco.setChecked(false);
            cbCore.setChecked(false);
        }

    }

    void changeMachinesSelecction() {

        if (rbFitness.isChecked() || rbMusculacion.isChecked() || rbMusculacion.isChecked()) {
            cbCinta.setChecked(false);
            cbBici.setChecked(false);
            cbPlacas.setChecked(false);
            cbPalancas.setChecked(false);
            cbMultifuncion.setChecked(false);
            cbBancos.setChecked(false);
        }

    }

    public void setupUi(QDialog Dialog) {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(900, 1100).expandedTo(Dialog.minimumSizeHint()));
        Dialog.setMinimumSize(new QSize(900, 1100));
        Dialog.setMaximumSize(new QSize(900, 1100));
        Dialog.setWindowIcon(new QIcon("classpath:resources/img_logo.png"));
        Dialog.setWindowTitle("FORMULARIO");

        frame = new QFrame(Dialog);
        frame.setObjectName("frame");
        frame.setGeometry(new QRect(0, 0, 300, 1100));
        frame.setMinimumSize(new QSize(300, 1100));
        frame.setMaximumSize(new QSize(300, 1100));
        QFont font = new QFont();
        font.setFamily("Comic Sans MS");
        font.setPointSize(14);
        frame.setFont(font);
        frame.setStyleSheet("background-color: rgb(0, 0, 127)");
        frame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);

        logoApp = new QLabel(frame);
        logoApp.setObjectName("logoApp");
        logoApp.setGeometry(new QRect(20, 290, 250, 500));
        logoApp.setMinimumSize(new QSize(250, 500));
        logoApp.setMaximumSize(new QSize(250, 500));
        logoApp.setPixmap(new QPixmap(("classpath:resources/img_logo.png")));
        logoApp.setScaledContents(true);

        label = new QLabel(frame);
        label.setObjectName("label");
        label.setGeometry(new QRect(-1, 140, 291, 41));
        QFont font1 = new QFont();
        font1.setFamily("Comic Sans MS");
        font1.setPointSize(14);
        label.setFont(font1);
        label.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        label_2 = new QLabel(frame);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(-1, 870, 291, 41));
        QFont font2 = new QFont();
        font2.setFamily("Comic Sans MS");
        font2.setPointSize(14);
        label_2.setFont(font2);
        label_2.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        frame_2 = new QFrame(Dialog);
        frame_2.setObjectName("frame_2");
        frame_2.setGeometry(new QRect(300, 0, 600, 1100));
        frame_2.setMinimumSize(new QSize(600, 1100));
        frame_2.setMaximumSize(new QSize(600, 1100));
        frame_2.setSizeIncrement(new QSize(0, 35));
        frame_2.setStyleSheet("background-color: rgb(0, 170, 255)");
        frame_2.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        frame_2.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);

        logoRegistro = new QLabel(frame_2);
        logoRegistro.setObjectName("logoRegistro");
        logoRegistro.setGeometry(new QRect(-10, 10, 100, 100));
        logoRegistro.setMinimumSize(new QSize(100, 100));
        logoRegistro.setMaximumSize(new QSize(100, 100));
        logoRegistro.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Plain);
        logoRegistro.setPixmap(new QPixmap(("classpath:resources/img_logo2.png")));
        logoRegistro.setScaledContents(true);

        txtRegistro = new QLabel(frame_2);
        txtRegistro.setObjectName("txtRegistro");
        txtRegistro.setGeometry(new QRect(120, 30, 221, 51));
        QFont font3 = new QFont();
        font3.setFamily("Comic Sans MS");
        font3.setPointSize(14);
        font3.setBold(true);
        font3.setWeight(75);
        txtRegistro.setFont(font3);

        txtDataTrain = new QLabel(frame_2);
        txtDataTrain.setObjectName("txtDataTrain");
        txtDataTrain.setGeometry(new QRect(10, 120, 261, 51));
        QFont font4 = new QFont();
        font4.setFamily("Comic Sans MS");
        font4.setPointSize(12);
        font4.setItalic(true);
        txtDataTrain.setFont(font4);

        txtDataTypeTrain = new QLabel(frame_2);
        txtDataTypeTrain.setObjectName("txtDataTypeTrain");
        txtDataTypeTrain.setGeometry(new QRect(10, 340, 271, 51));
        QFont font5 = new QFont();
        font5.setFamily("Comic Sans MS");
        font5.setPointSize(12);
        font5.setItalic(true);
        txtDataTypeTrain.setFont(font5);

        txtPayForm = new QLabel(frame_2);
        txtPayForm.setObjectName("txtPayForm");
        txtPayForm.setGeometry(new QRect(10, 830, 181, 51));
        QFont font6 = new QFont();
        font6.setFamily("Comic Sans MS");
        font6.setPointSize(12);
        font6.setItalic(true);
        txtPayForm.setFont(font6);

        line = new QFrame(frame_2);
        line.setObjectName("line");
        line.setGeometry(new QRect(10, 111, 571, 20));
        line.setStyleSheet("");
        line.setFrameShape(QFrame.Shape.HLine);

        txtCodigo = new QLabel(frame_2);
        txtCodigo.setObjectName("txtCodigo");
        txtCodigo.setGeometry(new QRect(400, 70, 101, 40));
        txtCodigo.setMinimumSize(new QSize(0, 40));
        txtCodigo.setSizeIncrement(new QSize(0, 40));
        QFont font7 = new QFont();
        font7.setFamily("Comic Sans MS");
        font7.setPointSize(11);
        txtCodigo.setFont(font7);

        txtInstructor = new QLabel(frame_2);
        txtInstructor.setObjectName("txtInstructor");
        txtInstructor.setGeometry(new QRect(20, 170, 141, 40));
        txtInstructor.setMinimumSize(new QSize(0, 40));
        txtInstructor.setSizeIncrement(new QSize(0, 40));
        QFont font8 = new QFont();
        font8.setFamily("Comic Sans MS");
        font8.setPointSize(11);
        txtInstructor.setFont(font8);

        txtEntrenamiento = new QLabel(frame_2);
        txtEntrenamiento.setObjectName("txtEntrenamiento");
        txtEntrenamiento.setGeometry(new QRect(20, 220, 171, 40));
        txtEntrenamiento.setMinimumSize(new QSize(0, 40));
        txtEntrenamiento.setSizeIncrement(new QSize(0, 40));
        QFont font9 = new QFont();
        font9.setFamily("Comic Sans MS");
        font9.setPointSize(11);
        txtEntrenamiento.setFont(font9);

        txtTelf = new QLabel(frame_2);
        txtTelf.setObjectName("txtTelf");
        txtTelf.setGeometry(new QRect(20, 270, 111, 40));
        txtTelf.setMinimumSize(new QSize(0, 40));
        txtTelf.setSizeIncrement(new QSize(0, 40));
        QFont font10 = new QFont();
        font10.setFamily("Comic Sans MS");
        font10.setPointSize(11);
        txtTelf.setFont(font10);

        txtFecha = new QLabel(frame_2);
        txtFecha.setObjectName("txtFecha");
        txtFecha.setGeometry(new QRect(295, 270, 126, 40));
        txtFecha.setMinimumSize(new QSize(0, 40));
        txtFecha.setSizeIncrement(new QSize(0, 40));
        QFont font11 = new QFont();
        font11.setFamily("Comic Sans MS");
        font11.setPointSize(11);
        txtFecha.setFont(font11);

        dateEdit = new QDateEdit(frame_2);
        dateEdit.setObjectName("dateEdit");
        dateEdit.setGeometry(new QRect(426, 270, 155, 40));
        dateEdit.setMinimumSize(new QSize(0, 40));
        dateEdit.setMaximumSize(new QSize(16777215, 40));
        QFont font12 = new QFont();
        font12.setFamily("Comic Sans MS");
        font12.setPointSize(11);
        dateEdit.setFont(font12);
        dateEdit.setButtonSymbols(com.trolltech.qt.gui.QAbstractSpinBox.ButtonSymbols.NoButtons);
        dateEdit.setCalendarPopup(true);
        dateEdit.setMinimumDate(QDate.currentDate());

        line_2 = new QFrame(frame_2);
        line_2.setObjectName("line_2");
        line_2.setGeometry(new QRect(10, 330, 571, 20));
        line_2.setStyleSheet("");
        line_2.setFrameShape(QFrame.Shape.HLine);

        gridLayoutWidget = new QWidget(frame_2);
        gridLayoutWidget.setObjectName("gridLayoutWidget");
        gridLayoutWidget.setGeometry(new QRect(30, 390, 551, 81));
        gridTypeTrain = new QGridLayout(gridLayoutWidget);
        gridTypeTrain.setObjectName("gridTypeTrain");

        rbFuncional = new QRadioButton(gridLayoutWidget);
        rbFuncional.setObjectName("rbFuncional");
        rbFuncional.setMinimumSize(new QSize(140, 35));
        rbFuncional.setMaximumSize(new QSize(140, 35));
        QFont font13 = new QFont();
        font13.setFamily("Comic Sans MS");
        font13.setPointSize(11);
        rbFuncional.setFont(font13);

        gridTypeTrain.addWidget(rbFuncional, 0, 1, 1, 1);

        rbCrossfit = new QRadioButton(gridLayoutWidget);
        rbCrossfit.setObjectName("rbCrossfit");
        rbCrossfit.setMinimumSize(new QSize(140, 35));
        rbCrossfit.setMaximumSize(new QSize(140, 35));
        QFont font14 = new QFont();
        font14.setFamily("Comic Sans MS");
        font14.setPointSize(11);
        rbCrossfit.setFont(font14);

        gridTypeTrain.addWidget(rbCrossfit, 0, 2, 1, 1);

        rbMuscular = new QRadioButton(gridLayoutWidget);
        rbMuscular.setObjectName("rbMuscular");
        rbMuscular.setMinimumSize(new QSize(140, 35));
        rbMuscular.setMaximumSize(new QSize(140, 35));
        QFont font15 = new QFont();
        font15.setFamily("Comic Sans MS");
        font15.setPointSize(11);
        rbMuscular.setFont(font15);

        gridTypeTrain.addWidget(rbMuscular, 0, 0, 1, 1);

        rbFuerza = new QRadioButton(gridLayoutWidget);
        rbFuerza.setObjectName("rbFuerza");
        rbFuerza.setMinimumSize(new QSize(140, 35));
        rbFuerza.setMaximumSize(new QSize(140, 35));
        QFont font16 = new QFont();
        font16.setFamily("Comic Sans MS");
        font16.setPointSize(11);
        rbFuerza.setFont(font16);

        gridTypeTrain.addWidget(rbFuerza, 1, 0, 1, 1);

        rbRunning = new QRadioButton(gridLayoutWidget);
        rbRunning.setObjectName("rbRunning");
        rbRunning.setMinimumSize(new QSize(140, 35));
        rbRunning.setMaximumSize(new QSize(140, 35));
        QFont font17 = new QFont();
        font17.setFamily("Comic Sans MS");
        font17.setPointSize(11);
        rbRunning.setFont(font17);

        gridTypeTrain.addWidget(rbRunning, 1, 1, 1, 1);

        rbFisico = new QRadioButton(gridLayoutWidget);
        rbFisico.setObjectName("rbFisico");
        rbFisico.setMinimumSize(new QSize(140, 35));
        rbFisico.setMaximumSize(new QSize(140, 35));
        QFont font18 = new QFont();
        font18.setFamily("Comic Sans MS");
        font18.setPointSize(11);
        rbFisico.setFont(font18);

        gridTypeTrain.addWidget(rbFisico, 1, 2, 1, 1);

        horizontalLayoutWidget = new QWidget(frame_2);
        horizontalLayoutWidget.setObjectName("horizontalLayoutWidget");
        horizontalLayoutWidget.setGeometry(new QRect(60, 520, 521, 51));
        layoutZonaTrabajo = new QHBoxLayout(horizontalLayoutWidget);
        layoutZonaTrabajo.setObjectName("layoutZonaTrabajo");
        cbSuperior = new QCheckBox(horizontalLayoutWidget);
        cbSuperior.setObjectName("cbSuperior");
        QFont font19 = new QFont();
        font19.setFamily("Comic Sans MS");
        font19.setPointSize(10);
        cbSuperior.setFont(font19);

        layoutZonaTrabajo.addWidget(cbSuperior);

        cbInferior = new QCheckBox(horizontalLayoutWidget);
        cbInferior.setObjectName("cbInferior");
        QFont font20 = new QFont();
        font20.setFamily("Comic Sans MS");
        font20.setPointSize(10);
        cbInferior.setFont(font20);

        layoutZonaTrabajo.addWidget(cbInferior);

        cbTronco = new QCheckBox(horizontalLayoutWidget);
        cbTronco.setObjectName("cbTronco");
        QFont font21 = new QFont();
        font21.setFamily("Comic Sans MS");
        font21.setPointSize(10);
        cbTronco.setFont(font21);

        layoutZonaTrabajo.addWidget(cbTronco);

        cbCore = new QCheckBox(horizontalLayoutWidget);
        cbCore.setObjectName("cbCore");
        QFont font22 = new QFont();
        font22.setFamily("Comic Sans MS");
        font22.setPointSize(10);
        cbCore.setFont(font22);

        layoutZonaTrabajo.addWidget(cbCore);

        txtZonaTrabajo = new QLabel(frame_2);
        txtZonaTrabajo.setObjectName("txtZonaTrabajo");
        txtZonaTrabajo.setGeometry(new QRect(30, 480, 321, 31));
        QFont font23 = new QFont();
        font23.setFamily("Comic Sans MS");
        font23.setPointSize(11);
        txtZonaTrabajo.setFont(font23);

        line_3 = new QFrame(frame_2);
        line_3.setObjectName("line_3");
        line_3.setGeometry(new QRect(10, 580, 571, 20));
        line_3.setStyleSheet("");
        line_3.setFrameShape(QFrame.Shape.HLine);

        txtSalas = new QLabel(frame_2);
        txtSalas.setObjectName("txtSalas");
        txtSalas.setGeometry(new QRect(10, 590, 221, 41));
        QFont font24 = new QFont();
        font24.setFamily("Comic Sans MS");
        txtSalas.setFont(font24);

        gridLayoutWidget_2 = new QWidget(frame_2);
        gridLayoutWidget_2.setObjectName("gridLayoutWidget_2");
        gridLayoutWidget_2.setGeometry(new QRect(40, 730, 541, 81));
        gridMaquinas = new QGridLayout(gridLayoutWidget_2);
        gridMaquinas.setObjectName("gridMaquinas");

        cbBici = new QCheckBox(gridLayoutWidget_2);
        cbBici.setObjectName("cbBici");
        cbBici.setMinimumSize(new QSize(150, 35));
        cbBici.setMaximumSize(new QSize(150, 35));
        QFont font25 = new QFont();
        font25.setPointSize(10);
        cbBici.setFont(font25);

        gridMaquinas.addWidget(cbBici, 0, 1, 1, 1);

        cbCinta = new QCheckBox(gridLayoutWidget_2);
        cbCinta.setObjectName("cbCinta");
        cbCinta.setMinimumSize(new QSize(150, 35));
        cbCinta.setMaximumSize(new QSize(150, 35));
        QFont font26 = new QFont();
        font26.setPointSize(10);
        cbCinta.setFont(font26);

        gridMaquinas.addWidget(cbCinta, 0, 0, 1, 1);

        cbPlacas = new QCheckBox(gridLayoutWidget_2);
        cbPlacas.setObjectName("cbPlacas");
        cbPlacas.setMinimumSize(new QSize(150, 35));
        cbPlacas.setMaximumSize(new QSize(150, 35));
        QFont font27 = new QFont();
        font27.setPointSize(10);
        cbPlacas.setFont(font27);

        gridMaquinas.addWidget(cbPlacas, 0, 2, 1, 1);

        cbPalancas = new QCheckBox(gridLayoutWidget_2);
        cbPalancas.setObjectName("cbPalancas");
        cbPalancas.setMinimumSize(new QSize(150, 35));
        cbPalancas.setMaximumSize(new QSize(150, 35));
        QFont font28 = new QFont();
        font28.setPointSize(10);
        cbPalancas.setFont(font28);

        gridMaquinas.addWidget(cbPalancas, 1, 0, 1, 1);

        cbMultifuncion = new QCheckBox(gridLayoutWidget_2);
        cbMultifuncion.setObjectName("cbMultifuncion");
        cbMultifuncion.setMinimumSize(new QSize(150, 35));
        cbMultifuncion.setMaximumSize(new QSize(150, 35));
        QFont font29 = new QFont();
        font29.setPointSize(10);
        cbMultifuncion.setFont(font29);

        gridMaquinas.addWidget(cbMultifuncion, 1, 1, 1, 1);

        cbBancos = new QCheckBox(gridLayoutWidget_2);
        cbBancos.setObjectName("cbBancos");
        cbBancos.setMinimumSize(new QSize(150, 35));
        cbBancos.setMaximumSize(new QSize(150, 35));
        QFont font30 = new QFont();
        font30.setPointSize(10);
        cbBancos.setFont(font30);

        gridMaquinas.addWidget(cbBancos, 1, 2, 1, 1);

        horizontalLayoutWidget_2 = new QWidget(frame_2);
        horizontalLayoutWidget_2.setObjectName("horizontalLayoutWidget_2");
        horizontalLayoutWidget_2.setGeometry(new QRect(30, 630, 551, 51));
        horizontalLayout = new QHBoxLayout(horizontalLayoutWidget_2);
        horizontalLayout.setObjectName("horizontalLayout");

        rbFitness = new QRadioButton(horizontalLayoutWidget_2);
        rbFitness.setObjectName("rbFitness");
        QFont font31 = new QFont();
        font31.setFamily("Comic Sans MS");
        font31.setPointSize(11);
        rbFitness.setFont(font31);

        horizontalLayout.addWidget(rbFitness);

        rbCross = new QRadioButton(horizontalLayoutWidget_2);
        rbCross.setObjectName("rbCross");
        QFont font32 = new QFont();
        font32.setFamily("Comic Sans MS");
        font32.setPointSize(11);
        rbCross.setFont(font32);

        horizontalLayout.addWidget(rbCross);

        rbMusculacion = new QRadioButton(horizontalLayoutWidget_2);
        rbMusculacion.setObjectName("rbMusculacion");
        QFont font33 = new QFont();
        font33.setFamily("Comic Sans MS");
        font33.setPointSize(11);
        rbMusculacion.setFont(font33);

        horizontalLayout.addWidget(rbMusculacion);

        txtMaquinas = new QLabel(frame_2);
        txtMaquinas.setObjectName("txtMaquinas");
        txtMaquinas.setGeometry(new QRect(30, 690, 391, 31));
        QFont font34 = new QFont();
        font34.setFamily("Comic Sans MS");
        font34.setPointSize(11);
        txtMaquinas.setFont(font34);

        line_4 = new QFrame(frame_2);
        line_4.setObjectName("line_4");
        line_4.setGeometry(new QRect(10, 820, 571, 20));
        line_4.setStyleSheet("");
        line_4.setFrameShape(QFrame.Shape.HLine);

        horizontalLayoutWidget_3 = new QWidget(frame_2);
        horizontalLayoutWidget_3.setObjectName("horizontalLayoutWidget_3");
        horizontalLayoutWidget_3.setGeometry(new QRect(30, 880, 551, 51));
        horizontalLayout_2 = new QHBoxLayout(horizontalLayoutWidget_3);
        horizontalLayout_2.setObjectName("horizontalLayout_2");

        rbSesion = new QRadioButton(horizontalLayoutWidget_3);
        rbSesion.setObjectName("rbSesion");
        QFont font35 = new QFont();
        font35.setFamily("Comic Sans MS");
        font35.setPointSize(11);
        rbSesion.setFont(font35);

        horizontalLayout_2.addWidget(rbSesion);

        rbBono = new QRadioButton(horizontalLayoutWidget_3);
        rbBono.setObjectName("rbBono");
        QFont font36 = new QFont();
        font36.setFamily("Comic Sans MS");
        font36.setPointSize(11);
        rbBono.setFont(font36);

        horizontalLayout_2.addWidget(rbBono);

        rbMensual = new QRadioButton(horizontalLayoutWidget_3);
        rbMensual.setObjectName("rbMensual");
        QFont font37 = new QFont();
        font37.setFamily("Comic Sans MS");
        font37.setPointSize(11);
        rbMensual.setFont(font37);

        horizontalLayout_2.addWidget(rbMensual);

        txtCantidadSesiones = new QLabel(frame_2);
        txtCantidadSesiones.setObjectName("txtCantidadSesiones");
        txtCantidadSesiones.setGeometry(new QRect(30, 940, 351, 40));
        txtCantidadSesiones.setMinimumSize(new QSize(0, 40));
        QFont font38 = new QFont();
        font38.setFamily("Comic Sans MS");
        font38.setPointSize(11);
        txtCantidadSesiones.setFont(font38);

        line_5 = new QFrame(frame_2);
        line_5.setObjectName("line_5");
        line_5.setGeometry(new QRect(10, 990, 571, 20));
        line_5.setStyleSheet("");
        line_5.setFrameShape(QFrame.Shape.HLine);

        spnCantidadSesiones = new QSpinBox(frame_2);
        spnCantidadSesiones.setObjectName("spnCantidadSesiones");
        spnCantidadSesiones.setGeometry(new QRect(390, 940, 101, 41));
        QFont font39 = new QFont();
        font39.setFamily("Comic Sans MS");
        font39.setPointSize(11);
        spnCantidadSesiones.setFont(font39);
        spnCantidadSesiones.setMinimum(2);
        spnCantidadSesiones.setMaximum(30);
        spnCantidadSesiones.setValue(2);

        txtPrice = new QLabel(frame_2);
        txtPrice.setObjectName("txtPrice");
        txtPrice.setGeometry(new QRect(10, 1030, 101, 40));
        txtPrice.setMinimumSize(new QSize(0, 40));
        txtPrice.setMaximumSize(new QSize(16777215, 40));
        QFont font40 = new QFont();
        font40.setFamily("Comic Sans MS");
        font40.setPointSize(12);
        font40.setItalic(true);
        font40.setUnderline(true);
        txtPrice.setFont(font40);

        txtSymbolMoney = new QLabel(frame_2);
        txtSymbolMoney.setObjectName("txtSymbolMoney");
        txtSymbolMoney.setGeometry(new QRect(230, 1030, 21, 41));
        QFont font41 = new QFont();
        font41.setFamily("Comic Sans MS");
        font41.setPointSize(12);
        font41.setBold(true);
        font41.setWeight(75);
        txtSymbolMoney.setFont(font41);

        btnSalir = new QPushButton(frame_2);
        btnSalir.setObjectName("btnSalir");
        btnSalir.setGeometry(new QRect(520, 1020, 61, 61));
        btnSalir.setMinimumSize(new QSize(61, 61));
        btnSalir.setMaximumSize(new QSize(61, 61));
        btnSalir.setIcon(new QIcon(new QPixmap("classpath:resources/salir.png")));
        btnSalir.setIconSize(new QSize(48, 48));

        btnSave = new QPushButton(frame_2);
        btnSave.setObjectName("btnSave");
        btnSave.setGeometry(new QRect(450, 1020, 61, 61));
        btnSave.setMinimumSize(new QSize(61, 61));
        btnSave.setMaximumSize(new QSize(61, 61));
        btnSave.setIcon(new QIcon(new QPixmap("classpath:resources/guardar.png")));
        btnSave.setIconSize(new QSize(48, 48));

        btnClean = new QPushButton(frame_2);
        btnClean.setObjectName("btnClean");
        btnClean.setGeometry(new QRect(380, 1020, 61, 61));
        btnClean.setMinimumSize(new QSize(61, 61));
        btnClean.setMaximumSize(new QSize(61, 61));
        btnClean.setIcon(new QIcon(new QPixmap("classpath:resources/clean.png")));
        btnClean.setIconSize(new QSize(64, 64));

        etCodigo = new QLineEdit(frame_2);
        etCodigo.setObjectName("etCodigo");
        etCodigo.setGeometry(new QRect(500, 70, 81, 40));
        etCodigo.setMinimumSize(new QSize(0, 40));
        etCodigo.setMaximumSize(new QSize(16777215, 40));
        QFont font42 = new QFont();
        font42.setFamily("Comic Sans MS");
        font42.setPointSize(11);
        etCodigo.setFont(font42);
        etCodigo.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.LeftToRight);
        etCodigo.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly));
        etCodigo.setMaxLength(4);

        etInstructor = new QLineEdit(frame_2);
        etInstructor.setObjectName("etInstructor");
        etInstructor.setGeometry(new QRect(200, 170, 380, 40));
        etInstructor.setMinimumSize(new QSize(380, 40));
        etInstructor.setMaximumSize(new QSize(380, 40));
        QFont font43 = new QFont();
        font43.setFamily("Comic Sans MS");
        font43.setPointSize(11);
        etInstructor.setFont(font43);
        etInstructor.setMaxLength(30);

        etEntrenamiento = new QLineEdit(frame_2);
        etEntrenamiento.setObjectName("etEntrenamiento");
        etEntrenamiento.setGeometry(new QRect(200, 220, 380, 40));
        etEntrenamiento.setMinimumSize(new QSize(380, 40));
        etEntrenamiento.setMaximumSize(new QSize(380, 40));
        QFont font44 = new QFont();
        font44.setFamily("Comic Sans MS");
        font44.setPointSize(11);
        etEntrenamiento.setFont(font44);
        etEntrenamiento.setMaxLength(20);

        etTelefono = new QLineEdit(frame_2);
        etTelefono.setObjectName("etTelefono");
        etTelefono.setGeometry(new QRect(140, 270, 141, 40));
        etTelefono.setMinimumSize(new QSize(0, 40));
        etTelefono.setMaximumSize(new QSize(16777215, 40));
        QFont font45 = new QFont();
        font45.setFamily("Comic Sans MS");
        font45.setPointSize(11);
        etTelefono.setFont(font45);
        etTelefono.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly));
        etTelefono.setMaxLength(9);

        etPrice = new QLineEdit(frame_2);
        etPrice.setObjectName("etPrice");
        etPrice.setGeometry(new QRect(110, 1030, 121, 40));
        etPrice.setMinimumSize(new QSize(0, 40));
        etPrice.setMaximumSize(new QSize(16777215, 40));
        QFont font46 = new QFont();
        font46.setFamily("Comic Sans MS");
        font46.setPointSize(11);
        etPrice.setFont(font46);
        etPrice.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhDigitsOnly));
        etPrice.setMaxLength(6);

        etPrice.setText("0.00");

        txtCodigo.setBuddy(etCodigo);
        txtInstructor.setBuddy(etInstructor);
        txtEntrenamiento.setBuddy(etEntrenamiento);
        txtTelf.setBuddy(etTelefono);
        txtFecha.setBuddy(dateEdit);
        txtCantidadSesiones.setBuddy(spnCantidadSesiones);
        txtPrice.setBuddy(etPrice);
        QWidget.setTabOrder(etCodigo, etInstructor);
        QWidget.setTabOrder(etInstructor, etEntrenamiento);
        QWidget.setTabOrder(etEntrenamiento, etTelefono);
        QWidget.setTabOrder(etTelefono, dateEdit);
        QWidget.setTabOrder(dateEdit, rbMuscular);
        QWidget.setTabOrder(rbMuscular, rbFuncional);
        QWidget.setTabOrder(rbFuncional, rbCrossfit);
        QWidget.setTabOrder(rbCrossfit, rbFuerza);
        QWidget.setTabOrder(rbFuerza, rbRunning);
        QWidget.setTabOrder(rbRunning, rbFisico);
        QWidget.setTabOrder(rbFisico, cbSuperior);
        QWidget.setTabOrder(cbSuperior, cbInferior);
        QWidget.setTabOrder(cbInferior, cbTronco);
        QWidget.setTabOrder(cbTronco, cbCore);
        QWidget.setTabOrder(cbCore, rbFitness);
        QWidget.setTabOrder(rbFitness, rbCross);
        QWidget.setTabOrder(rbCross, rbMusculacion);
        QWidget.setTabOrder(rbMusculacion, cbCinta);
        QWidget.setTabOrder(cbCinta, cbBici);
        QWidget.setTabOrder(cbBici, cbPlacas);
        QWidget.setTabOrder(cbPlacas, cbPalancas);
        QWidget.setTabOrder(cbPalancas, cbMultifuncion);
        QWidget.setTabOrder(cbMultifuncion, cbBancos);
        QWidget.setTabOrder(cbBancos, rbSesion);
        QWidget.setTabOrder(rbSesion, rbBono);
        QWidget.setTabOrder(rbBono, rbMensual);
        QWidget.setTabOrder(rbMensual, spnCantidadSesiones);
        QWidget.setTabOrder(spnCantidadSesiones, etPrice);
        QWidget.setTabOrder(etPrice, btnClean);
        QWidget.setTabOrder(btnClean, btnSave);
        QWidget.setTabOrder(btnSave, btnSalir);

        retranslateUi(Dialog);
        btnSalir.clicked.connect(Dialog, "close()");
//        btnSave.clicked.connect(Dialog, "close()");

        rbSesion.clicked.connect(spnCantidadSesiones, "setDisabled(boolean)");
        rbMensual.clicked.connect(spnCantidadSesiones, "setDisabled(boolean)");
        rbBono.clicked.connect(spnCantidadSesiones, "setEnabled(boolean)");

        rbFitness.clicked.connect(cbCinta, "setEnabled(boolean)");
        rbFitness.clicked.connect(cbPalancas, "setEnabled(boolean)");
        rbFitness.clicked.connect(cbMultifuncion, "setEnabled(boolean)");
        rbFitness.clicked.connect(cbBancos, "setEnabled(boolean)");
        rbFitness.clicked.connect(cbBici, "setEnabled(boolean)");
        rbFitness.clicked.connect(cbPlacas, "setEnabled(boolean)");
        rbCross.clicked.connect(cbPlacas, "setEnabled(boolean)");
        rbCross.clicked.connect(cbBici, "setDisabled(boolean)");
        rbCross.clicked.connect(cbCinta, "setDisabled(boolean)");
        rbCross.clicked.connect(cbPalancas, "setEnabled(boolean)");
        rbCross.clicked.connect(cbMultifuncion, "setDisabled(boolean)");
        rbCross.clicked.connect(cbBancos, "setDisabled(boolean)");
        rbMusculacion.clicked.connect(cbBancos, "setEnabled(boolean)");
        rbMusculacion.clicked.connect(cbMultifuncion, "setEnabled(boolean)");
        rbMusculacion.clicked.connect(cbPalancas, "setDisabled(boolean)");
        rbMusculacion.clicked.connect(cbPlacas, "setDisabled(boolean)");
        rbMusculacion.clicked.connect(cbBici, "setDisabled(boolean)");
        rbMusculacion.clicked.connect(cbCinta, "setDisabled(boolean)");
        rbMuscular.clicked.connect(cbSuperior, "setEnabled(boolean)");
        rbMuscular.clicked.connect(cbInferior, "setEnabled(boolean)");
        rbMuscular.clicked.connect(cbTronco, "setEnabled(boolean)");
        rbMuscular.clicked.connect(cbCore, "setEnabled(boolean)");
        rbFuncional.clicked.connect(cbSuperior, "setDisabled(boolean)");
        rbFuncional.clicked.connect(cbInferior, "setDisabled(boolean)");
        rbFuncional.clicked.connect(cbTronco, "setDisabled(boolean)");
        rbFuncional.clicked.connect(cbCore, "setDisabled(boolean)");
        rbCrossfit.clicked.connect(cbCore, "setDisabled(boolean)");
        rbCrossfit.clicked.connect(cbTronco, "setDisabled(boolean)");
        rbCrossfit.clicked.connect(cbInferior, "setDisabled(boolean)");
        rbCrossfit.clicked.connect(cbSuperior, "setDisabled(boolean)");
        rbFuerza.clicked.connect(cbCore, "setDisabled(boolean)");
        rbFuerza.clicked.connect(cbTronco, "setDisabled(boolean)");
        rbFuerza.clicked.connect(cbInferior, "setDisabled(boolean)");
        rbFuerza.clicked.connect(cbSuperior, "setDisabled(boolean)");
        rbRunning.clicked.connect(cbSuperior, "setDisabled(boolean)");
        rbRunning.clicked.connect(cbInferior, "setDisabled(boolean)");
        rbRunning.clicked.connect(cbTronco, "setDisabled(boolean)");
        rbRunning.clicked.connect(cbCore, "setDisabled(boolean)");
        rbFisico.clicked.connect(cbCore, "setEnabled(boolean)");
        rbFisico.clicked.connect(cbTronco, "setEnabled(boolean)");
        rbFisico.clicked.connect(cbInferior, "setEnabled(boolean)");
        rbFisico.clicked.connect(cbSuperior, "setEnabled(boolean)");
        btnClean.clicked.connect(etPrice, "clear()");
        btnClean.clicked.connect(etTelefono, "clear()");
        btnClean.clicked.connect(etEntrenamiento, "clear()");
        btnClean.clicked.connect(etInstructor, "clear()");
        btnClean.clicked.connect(etCodigo, "clear()");

        /**
         ***********************************************************************
         ***********************************************************************
         ****Creamos los signal/slots que no hemos podido crear desde QTJambi
         * *********************************************************************
         * *********************************************************************
         */
        //Creamos expresiones regulares para validar los campos
        //Validamos el campo Código
        QRegExp valCodigo = new QRegExp("^[0-9]{1,4}");
        etCodigo.setValidator(new QRegExpValidator(valCodigo));
        //Validamos el campo Instructor
        QRegExp valInstructor = new QRegExp("^[a-zA-Z\\s]{1,30}");
        etInstructor.setValidator(new QRegExpValidator(valInstructor));
        //Validamos el campo Pprecio
        QRegExp valPrice = new QRegExp("^([0-9]{3})(\\.[0-9]{2})");
        etPrice.setValidator(new QRegExpValidator(valPrice));
        //Validamos el campo Teléfono
        QRegExp valTelefono = new QRegExp("^[0-9]{9}");
        etTelefono.setValidator(new QRegExpValidator(valTelefono));
        //Validamos el campo entrenamieto
        QRegExp valEntrenamiento = new QRegExp("^[a-zA-Z\\s]{1,20}");
        etEntrenamiento.setValidator(new QRegExpValidator(valEntrenamiento));

        btnSave.clicked.connect(this, "verifyDataForm()");
        btnClean.clicked.connect(this, "resetPrice()");

        rbRunning.clicked.connect(this, "changeTrainSelectedOptions()");
        rbFuncional.clicked.connect(this, "changeTrainSelectedOptions()");
        rbCrossfit.clicked.connect(this, "changeTrainSelectedOptions()");
        rbFuerza.clicked.connect(this, "changeTrainSelectedOptions()");

        rbFitness.clicked.connect(this, "changeMachinesSelecction()");
        rbCross.clicked.connect(this, "changeMachinesSelecction()");
        rbMusculacion.clicked.connect(this, "changeMachinesSelecction()");

        cbSuperior.clicked.connect(cbInferior, "setDisabled(boolean)");
        cbSuperior.clicked.connect(cbTronco, "setDisabled(boolean)");
        cbSuperior.clicked.connect(cbCore, "setDisabled(boolean)");

        cbInferior.clicked.connect(cbSuperior, "setDisabled(boolean)");
        cbInferior.clicked.connect(cbTronco, "setDisabled(boolean)");
        cbInferior.clicked.connect(cbCore, "setDisabled(boolean)");

        cbTronco.clicked.connect(cbSuperior, "setDisabled(boolean)");
        cbTronco.clicked.connect(cbInferior, "setDisabled(boolean)");
        cbTronco.clicked.connect(cbCore, "setDisabled(boolean)");

        cbCore.clicked.connect(cbSuperior, "setDisabled(boolean)");
        cbCore.clicked.connect(cbTronco, "setDisabled(boolean)");
        cbCore.clicked.connect(cbInferior, "setDisabled(boolean)");

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog) {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        logoApp.setText("");
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" color:#ffffff;\">GIMNASIO</span></p></body></html>", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" color:#ffffff;\">AL - ANDALUS</span></p></body></html>", null));
        logoRegistro.setText("");
        txtRegistro.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Registro Nuevo", null));
        txtDataTrain.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" text-decoration: underline;\">Datos Entrenamiento:</span></p></body></html>", null));
        txtDataTypeTrain.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" text-decoration: underline;\">Tipo de entrenamiento:</span></p></body></html>", null));
        txtPayForm.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" text-decoration: underline;\">Forma de Pago:</span></p></body></html>", null));
        txtCodigo.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&C\u00f3digo:", null));
        txtInstructor.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Instructor:", null));
        txtEntrenamiento.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Entrenamiento:", null));
        txtTelf.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Tel\u00e9fono:", null));
        txtFecha.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Fecha inicio:", null));
        rbFuncional.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Funcional", null));
        rbCrossfit.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Crossfit", null));
        rbMuscular.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Muscular", null));
        rbFuerza.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fuerza", null));
        rbRunning.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Running", null));
        rbFisico.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "F\u00edsico", null));
        cbSuperior.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Superior", null));
        cbInferior.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Inferior", null));
        cbTronco.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tronco", null));
        cbCore.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Core", null));
        txtZonaTrabajo.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Seleccione zona de trabajo:", null));
        txtSalas.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p><span style=\" font-size:12pt; font-style:italic; text-decoration: underline;\">Ubicaci\u00f3n de salas:</span></p></body></html>", null));
        cbBici.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Bicicleta", null));
        cbCinta.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cinta", null));
        cbPlacas.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Placas", null));
        cbPalancas.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Palancas", null));
        cbMultifuncion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Multifunci\u00f3n", null));
        cbBancos.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Bancos", null));
        rbFitness.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sala fitness", null));
        rbCross.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sala Cross", null));
        rbMusculacion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sala Musculaci\u00f3n", null));
        txtMaquinas.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Seleccione las m\u00e1quinas necesarias:", null));
        rbSesion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sesi\u00f3n", null));
        rbBono.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Bono", null));
        rbMensual.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Mensual", null));
        txtCantidadSesiones.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Seleccione las sesiones del bono:", null));
        txtPrice.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Precio:", null));
        txtSymbolMoney.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "\u20ac", null));
        btnSalir.setText("");
        btnSave.setText("");
        btnClean.setText("");
        etCodigo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Introduza el codigo de regitro.", null));
        etCodigo.setText("");

        //Agregamos los Tooltip que se nos ha olviaddo agregar desde QTDesigner
        etInstructor.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Introduza el nombre del instructor responsable del entrenamiento.", null));
        etEntrenamiento.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Introduza el nombre del entrenamiento a realizar.", null));
        etTelefono.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Introduza el teléfono del cliente.", null));
        etPrice.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Introduza el precio del entrenamiento.", null));
        spnCantidadSesiones.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Selecciones la cantidad de sesiones del bono.", null));
        dateEdit.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Introduza la fecha de registro.", null));

    } // retranslateUi

}
