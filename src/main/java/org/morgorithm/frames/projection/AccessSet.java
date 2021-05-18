package org.morgorithm.frames.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

// 멤버의 시설 입장, 퇴장 기간 로그 (멤버id, 시설id, 입장로그번호, 퇴장로그번호, 입장시간, 퇴장시간)
//@AllArgsConstructor
//@ToString
//@Getter
public interface AccessSet {
//    private Long memberId;
//    private Long facilityId;
//    private Long statusEnterId;
//    private Long statusLeaveId;
//    private double temperatureEnter;
//    private double temperatureLeave;
//    private LocalDateTime timeEnter;
//    private LocalDateTime timeLeave;

    Long getMemberId();
    Long getFacilityId();
    Long getStatusEnterId();
    Long getStatusLeaveId();
    Double getTemperatureEnter();
    Double getTemperatureLeave();
    LocalDateTime getTimeEnter();
    LocalDateTime getTimeLeave();

    default String asString() {
        StringBuilder sb = new StringBuilder();
        sb.append("statusEnterId: ")
                .append(getStatusEnterId())
                .append(", statusLeaveId: ")
                .append(getStatusLeaveId())
                .append(", memberId: ")
                .append(getMemberId())
                .append(", facilityId: ")
                .append(getFacilityId())
                .append(", temperatureEnter: ")
                .append(getTemperatureEnter())
                .append(", temperatureLeave: ")
                .append(getTemperatureLeave())
                .append(", timeEnter: ")
                .append(getTimeEnter())
                .append(", timeLeave: ")
                .append(getTimeLeave());
        return sb.toString();
    }
}
