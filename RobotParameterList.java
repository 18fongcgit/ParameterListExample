package org.firstinspires.ftc.teamcode.skidsteer_base;


import android.util.Log;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by user on 2/24/2019.
 */

public class RobotParameterList {

        String result = "";
        InputStream inputStream;
        Properties prop;

        public RobotParameterList() {

            try{
                prop = new Properties();

                String propFileName = "/sdcard/FIRST/robot_parameters.txt";



                inputStream = new FileInputStream( propFileName);


                Log.e("Exception", "ABCD propFileName " + propFileName );
                Log.e("Exception", "ABCD inputStream " + inputStream );
                if (inputStream != null) {
                    prop.load(inputStream);
                    Log.e("Exception", "ABCD inputStream valid");
                } else {
                    Log.e("Exception", "ABCD inputStream INVALID");
                    throw new FileNotFoundException("ABCD property file '" + propFileName + "' not found in the classpath");

                }


            } catch (Exception e) {
                System.out.println("Exception: " + e);
            } finally {
                try {
                    Log.e("Exception", "ABCD inputstream close " );
                    inputStream.close();
                } catch (Exception e){

                }

            }
        }

        public int getParamValueInt(String getParamString )
        {
            // get the property value and print it out
            return ( Integer.valueOf( prop.getProperty(getParamString,9999) ) );
        }

        public double getParamValueDouble(String getParamString )
        {
            // get the property value and print it out
            return ( Double.valueOf( prop.getProperty(getParamString,"0.99999") ) );
        }


}
