package cn.itrip.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Role implements Serializable {
        //
        private Integer roleid;
        //
        private String name;
        //get set 方法
            public void setRoleid (Integer  roleid){
                this.roleid=roleid;
            }
            public  Integer getRoleid(){
                return this.roleid;
            }
            public void setName (String  name){
                this.name=name;
            }
            public  String getName(){
                return this.name;
            }
}
