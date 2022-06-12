package com.example.project2_1202397;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calculator extends Application {

    @Override
    public void start(Stage stage){

        Group group = new Group();
        Scene scene= new Scene(group, Color.LIGHTBLUE);
        Stack <String> stack = new Stack<>();

        Font font = new Font(20);

        DropShadow dropShadow=new DropShadow();
        dropShadow.setColor(Color.DARKBLUE);
        dropShadow.setRadius(40);
        dropShadow.setWidth(40);
        dropShadow.setHeight(40);

        Button zero = new Button("0");
        zero.setMinSize(120,50);
        zero.setFont(font);
        zero.setStyle("-fx-background-color: #616161");

        Button one = new Button("1");
        one.setMinSize(120,50);
        one.setFont(font);
        one.setStyle("-fx-background-color: #616161");

        Button two = new Button("2");
        two.setMinSize(120,50);
        two.setFont(font);
        two.setStyle("-fx-background-color: #616161");

        Button three = new Button("3");
        three.setMinSize(120,50);
        three.setFont(font);
        three.setStyle("-fx-background-color: #616161");

        Button four = new Button("4");
        four.setMinSize(120,50);
        four.setFont(font);
        four.setStyle("-fx-background-color: #616161");

        Button five = new Button("5");
        five.setMinSize(120,50);
        five.setFont(font);
        five.setStyle("-fx-background-color: #616161");

        Button six = new Button("6");
        six.setMinSize(120,50);
        six.setFont(font);
        six.setStyle("-fx-background-color: #616161");

        Button seven = new Button("7");
        seven.setMinSize(120,50);
        seven.setFont(font);
        seven.setStyle("-fx-background-color: #616161");

        Button eghit = new Button("8");
        eghit.setMinSize(120,50);
        eghit.setFont(font);
        eghit.setStyle("-fx-background-color: #616161");

        Button nine = new Button("9");
        nine.setMinSize(120,50);
        nine.setFont(font);
        nine.setStyle("-fx-background-color: #616161");

        Button plus = new Button("+");
        plus.setMinSize(120,50);
        plus.setFont(font);
        plus.setStyle("-fx-background-color: #999999");

        Button minus = new Button("-");
        minus.setMinSize(120,50);
        minus.setFont(font);
        minus.setStyle("-fx-background-color: #999999");

        Button div = new Button("/");
        div.setMinSize(120,50);
        div.setFont(font);
        div.setStyle("-fx-background-color: #999999");

        Button mul = new Button("*");
        mul.setMinSize(120,50);
        mul.setFont(font);
        mul.setStyle("-fx-background-color: #999999");

        Button mod = new Button("%");
        mod.setMinSize(120,50);
        mod.setFont(font);
        mod.setStyle("-fx-background-color: #999999");

        Button dot = new Button(".");
        dot.setMinSize(120,50);
        dot.setFont(font);
        dot.setStyle("-fx-background-color: #ffffff");

        Button liftBracts = new Button("(");
        liftBracts.setMinSize(120,50);
        liftBracts.setFont(font);
        liftBracts.setStyle("-fx-background-color: #ffffff");

        Button rightBracts = new Button(")");
        rightBracts.setMinSize(120,50);
        rightBracts.setFont(font);
        rightBracts.setStyle("-fx-background-color: #ffffff");

        Button negation = new Button("(-)");
        negation.setMinSize(120,50);
        negation.setFont(font);
        negation.setStyle("-fx-background-color: #ffffff");

        Button off = new Button("OFF");
        off.setMinSize(120,50);
        off.setFont(font);
        off.setStyle("-fx-background-color: #FA8072");

        Button clearAll = new Button("CA");
        clearAll.setMinSize(120,50);
        clearAll.setFont(font);
        clearAll.setStyle("-fx-background-color: #FA8072");

        Button clear = new Button("C");
        clear.setMinSize(120,50);
        clear.setFont(font);
        clear.setStyle("-fx-background-color: #FA8072");

        Button back = new Button("back");
        back.setMinSize(120,50);
        back.setFont(font);
        back.setStyle("-fx-background-color: #FA8072");

        Button sin = new Button("sin");
        sin.setMinSize(120,50);
        sin.setFont(font);
        sin.setStyle("-fx-background-color: #C0C0C0");

        Button cos = new Button("cos");
        cos.setMinSize(120,50);
        cos.setFont(font);
        cos.setStyle("-fx-background-color: #C0C0C0");

        Button tan = new Button("tan");
        tan.setMinSize(120,50);
        tan.setFont(font);
        tan.setStyle("-fx-background-color: #C0C0C0");

        Button pi = new Button("π");
        pi.setMinSize(120,50);
        pi.setFont(font);
        pi.setStyle("-fx-background-color: #C0C0C0");

        Button power = new Button("y^x");
        power.setMinSize(120,50);
        power.setFont(font);
        power.setStyle("-fx-background-color: #C0C0C0");

        Button square = new Button("x^2");
        square.setMinSize(120,50);
        square.setFont(font);
        square.setStyle("-fx-background-color: #C0C0C0");

        Button squarRoot = new Button("√x");
        squarRoot.setMinSize(120,50);
        squarRoot.setFont(font);
        squarRoot.setStyle("-fx-background-color: #C0C0C0");

        Button exp = new Button("e^x");
        exp.setMinSize(120,50);
        exp.setFont(font);
        exp.setStyle("-fx-background-color: #C0C0C0");

        Button nuturalLog = new Button("LN");
        nuturalLog.setMinSize(120,50);
        nuturalLog.setFont(font);
        nuturalLog.setStyle("-fx-background-color: #C0C0C0");

        Button Log = new Button("LOG");
        Log.setMinSize(120,50);
        Log.setFont(font);
        Log.setStyle("-fx-background-color: #C0C0C0");

        Button divone = new Button("1/x");
        divone.setMinSize(120,50);
        divone.setFont(font);
        divone.setStyle("-fx-background-color: #C0C0C0");

        Button factorial = new Button("!");
        factorial.setMinSize(120,50);
        factorial.setFont(font);
        factorial.setStyle("-fx-background-color: #C0C0C0");

        Button equal = new Button("=");
        equal.setMinSize(288,50);
        Button expr = new Button("expression");
        expr.setMinSize(288,50);
        Button post = new Button("postfix");
        post.setMinSize(288,50);

        TextField expression = new TextField();
        expression.setMinHeight(60);
        expression.setEditable(false);
        TextField postfix = new TextField();
        postfix.setMinHeight(60);
        postfix.setEditable(false);
        TextField result = new TextField();
        result.setMinHeight(60);
        result.setEditable(false);

        zero.setOnAction(actionEvent -> expression.appendText("0"));
        zero.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> zero.setEffect(dropShadow)));
        zero.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> zero.setEffect(null)));

        one.setOnAction(actionEvent -> expression.appendText("1"));
        one.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> one.setEffect(dropShadow)));
        one.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> one.setEffect(null)));

        two.setOnAction(actionEvent -> expression.appendText("2"));
        two.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> two.setEffect(dropShadow)));
        two.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> two.setEffect(null)));

        three.setOnAction(actionEvent -> expression.appendText("3"));
        three.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> three.setEffect(dropShadow)));
        three.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> three.setEffect(null)));

        four.setOnAction(actionEvent -> expression.appendText("4"));
        four.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> four.setEffect(dropShadow)));
        four.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> four.setEffect(null)));

        five.setOnAction(actionEvent -> expression.appendText("5"));
        five.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> five.setEffect(dropShadow)));
        five.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> five.setEffect(null)));

        six.setOnAction(actionEvent -> expression.appendText("6"));
        six.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> six.setEffect(dropShadow)));
        six.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> six.setEffect(null)));

        seven.setOnAction(actionEvent -> expression.appendText("7"));
        seven.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> seven.setEffect(dropShadow)));
        seven.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> seven.setEffect(null)));

        eghit.setOnAction(actionEvent -> expression.appendText("8"));
        eghit.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> eghit.setEffect(dropShadow)));
        eghit.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> eghit.setEffect(null)));

        nine.setOnAction(actionEvent -> expression.appendText("9"));
        nine.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> nine.setEffect(dropShadow)));
        nine.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> nine.setEffect(null)));

        plus.setOnAction(actionEvent -> expression.appendText("+"));
        plus.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> plus.setEffect(dropShadow)));
        plus.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> plus.setEffect(null)));

        minus.setOnAction(actionEvent -> expression.appendText("-"));
        minus.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> minus.setEffect(dropShadow)));
        minus.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> minus.setEffect(null)));

        div.setOnAction(actionEvent -> expression.appendText("/"));
        div.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> div.setEffect(dropShadow)));
        div.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> div.setEffect(null)));

        mul.setOnAction(actionEvent -> expression.appendText("*"));
        mul.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> mul.setEffect(dropShadow)));
        mul.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> mul.setEffect(null)));

        sin.setOnAction(actionEvent -> expression.appendText("sin("));
        sin.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> sin.setEffect(dropShadow)));
        sin.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> sin.setEffect(null)));

        cos.setOnAction(actionEvent -> expression.appendText("cos("));
        cos.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> cos.setEffect(dropShadow)));
        cos.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> cos.setEffect(null)));

        tan.setOnAction(actionEvent -> expression.appendText("tan("));
        tan.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> tan.setEffect(dropShadow)));
        tan.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> tan.setEffect(null)));

        liftBracts.setOnAction(actionEvent -> expression.appendText("("));
        liftBracts.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> liftBracts.setEffect(dropShadow)));
        liftBracts.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> liftBracts.setEffect(null)));

        rightBracts.setOnAction(actionEvent -> expression.appendText(")"));
        rightBracts.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> rightBracts.setEffect(dropShadow)));
        rightBracts.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> rightBracts.setEffect(null)));

        factorial.setOnAction(actionEvent -> expression.appendText("!"));
        factorial.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> factorial.setEffect(dropShadow)));
        factorial.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> factorial.setEffect(null)));

        pi.setOnAction(actionEvent -> expression.appendText("π"));
        pi.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> pi.setEffect(dropShadow)));
        pi.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> pi.setEffect(null)));

        power.setOnAction(actionEvent -> expression.appendText("^"));
        power.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> power.setEffect(dropShadow)));
        power.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> power.setEffect(null)));

        square.setOnAction(actionEvent -> expression.appendText("^2"));
        square.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> square.setEffect(dropShadow)));
        square.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> square.setEffect(null)));

        squarRoot.setOnAction(actionEvent -> expression.appendText("√"));
        squarRoot.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> squarRoot.setEffect(dropShadow)));
        squarRoot.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> squarRoot.setEffect(null)));

        exp.setOnAction(actionEvent -> expression.appendText("e"));
        exp.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> exp.setEffect(dropShadow)));
        exp.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> exp.setEffect(null)));

        nuturalLog.setOnAction(actionEvent -> expression.appendText("LN("));
        nuturalLog.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> nuturalLog.setEffect(dropShadow)));
        nuturalLog.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> nuturalLog.setEffect(null)));

        Log.setOnAction(actionEvent -> expression.appendText("LOG("));
        Log.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> Log.setEffect(dropShadow)));
        Log.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> Log.setEffect(null)));

        divone.setOnAction(actionEvent -> expression.appendText("1/"));
        divone.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> divone.setEffect(dropShadow)));
        divone.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> divone.setEffect(null)));

        dot.setOnAction(actionEvent -> expression.appendText("."));
        dot.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> dot.setEffect(dropShadow)));
        dot.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> dot.setEffect(null)));

        mod.setOnAction(actionEvent -> expression.appendText("%"));
        mod.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> mod.setEffect(dropShadow)));
        mod.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> mod.setEffect(null)));

        negation.setOnAction(actionEvent -> expression.appendText("-"));
        negation.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> negation.setEffect(dropShadow)));
        negation.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> negation.setEffect(null)));

        off.setOnAction(actionEvent -> stage.close());
        off.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> off.setEffect(dropShadow)));
        off.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> off.setEffect(null)));

        clearAll.setOnAction(actionEvent -> {
            expression.clear();
            postfix.clear();
            result.clear();
        });
        clearAll.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> clearAll.setEffect(dropShadow)));
        clearAll.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> clearAll.setEffect(null)));

        clear.setOnAction(actionEvent -> expression.setText(expression.getText(0,expression.getText().length()-1)));
        clear.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent-> clear.setEffect(dropShadow)));
        clear.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent-> clear.setEffect(null)));

        equal.setOnAction(actionEvent -> {

                postfix.setText(stack.convert2Postfix(expression.getText()));
                result.setText(String.valueOf(stack.evaluatePostfix(postfix.getText())));

        });

        HBox hBox=new HBox();
        hBox.setSpacing(5);
        hBox.getChildren().addAll(sin,cos,tan,liftBracts,rightBracts, factorial,off);

        HBox hBox1=new HBox();
        hBox1.setSpacing(5);
        hBox1.getChildren().addAll(pi,power,seven,eghit,nine,div, negation);

        HBox hBox2=new HBox();
        hBox2.setSpacing(5);
        hBox2.getChildren().addAll(square,squarRoot,four,five, six,mul,clearAll);

        HBox hBox3 = new HBox();
        hBox3.setSpacing(5);
        hBox3.getChildren().addAll(exp,nuturalLog,one,two,three,minus,clear);

        HBox hBox4 = new HBox();
        hBox4.setSpacing(5);
        hBox4.getChildren().addAll(Log,divone,zero, dot,mod,plus,back);

        HBox hBox5 =new HBox();
        hBox5.setSpacing(5);
        hBox5.getChildren().addAll(expr,equal,post);

        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.getChildren().addAll(expression,postfix,result,hBox,hBox1,hBox2,hBox3,hBox4,hBox5);
        group.getChildren().addAll(vBox);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}