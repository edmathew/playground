package pt.ejpm.learn.hibernate.filehandler.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
 
/**
 *
 * @author ejpmateus
 */
@Entity
public class FileConfig implements Serializable {

    @Id
    private String fileCode;

    private String fileType;
    private String fileName;
    private char fileAction;

    protected FileConfig() {
    }
    

}
