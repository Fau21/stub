package id.co.telkomsel.digitalcore.stub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RE2Notify {
    @JsonProperty("total_file")
    private
    int totalFile;

    @JsonProperty("file_transfer_date")
    private
    String transferDate;

    @JsonProperty("file_transfer_status")
    private
    String transferStatus;

    @JsonProperty("failed_list")
    private
    String failedList;

    public int getTotalFile() {
        return totalFile;
    }

    public void setTotalFile(int totalFile) {
        this.totalFile = totalFile;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public String getFailedList() {
        return failedList;
    }

    public void setFailedList(String failedList) {
        this.failedList = failedList;
    }
}
