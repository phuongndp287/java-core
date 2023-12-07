package Service;

import Model.CompactDiscVo;

import java.util.List;

public interface ICompactDiscService {
    boolean addCompactDisc(List<CompactDiscVo> compactDiscList, Long compactDiscId);
    Long getQtyCompactDisc(List<CompactDiscVo> compactDiscList);
    Double getTotalPrice(List<CompactDiscVo> compactDiscList);
    List<CompactDiscVo> orderDescByPrice(List<CompactDiscVo> compactDiscList);
    List<CompactDiscVo> orderAscByTitle(List<CompactDiscVo> compactDiscList);
    void exportAll(List<CompactDiscVo> compactDiscList);
}
