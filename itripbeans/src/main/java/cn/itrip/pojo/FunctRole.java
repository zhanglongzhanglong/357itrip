package cn.itrip.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class FunctRole implements Serializable {
        //
        private Integer roleid;
        //
        private Integer functid;
        //get set 方法
            public void setRoleid (Integer  roleid){
                this.roleid=roleid;
            }
            public  Integer getRoleid(){
                return this.roleid;
            }
            public void setFunctid (Integer  functid){
                this.functid=functid;
            }
            public  Integer getFunctid(){
                return this.functid;
            }
}
