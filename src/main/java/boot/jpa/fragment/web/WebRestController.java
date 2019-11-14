package boot.jpa.fragment.web;

import boot.jpa.fragment.dto.HeroFindByIdResponseDto;
import boot.jpa.fragment.dto.HeroSaveRequestDto;
import boot.jpa.fragment.dto.HeroUpdateRequestDto;
import boot.jpa.fragment.service.HeroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class WebRestController {

    private HeroService heroService;

    @PostMapping("/save")
    public Long HeroSaveRequest(@RequestBody HeroSaveRequestDto dto) {
        return heroService.HeroSaveRequest(dto);
    }

    @PostMapping("/find")
    public HeroFindByIdResponseDto HeroFindByIdResponse(@RequestBody Long id) {
        return heroService.HeroFindByIdResponse(id);
    }

    @PutMapping("/update")
    public Long HeroUpdateRequest(@RequestBody HeroUpdateRequestDto dto) {
        return heroService.HeroUpdateRequest(dto);
    }

    @DeleteMapping("/delete")
    public Long HeroDeleteByIdRequest(@RequestBody Long id) {
        heroService.HeroDeleteByIdRequest(id);
        return id;
    }
}
