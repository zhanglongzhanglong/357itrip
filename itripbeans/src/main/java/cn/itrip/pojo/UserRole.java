package cn.itrip.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class UserRole implements Serializable {
        //
        private Integer roleid;
        //
        private Integer uid;
        //get set 方法
            public void setRoleid (Integer  roleid){
                this.roleid=roleid;
            }
            public  Integer getRoleid(){
                return this.roleid;
            }
            public void setUid (Integer  uid){
                this.uid=uid;
            }
            public  Integer getUid(){
                return this.uid;
            }
}
