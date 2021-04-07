package com.winit.controller.manage;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.winit.common.utils.PutFileUtils;

/**
 * 
 * @desc 图片上传模块      先上传图片  -  返回给前端url  前端  点击修改用户资料 保存后 入库
 * @author qiufeng
 * @version 1.0
 * @time 2021年4月7日 下午1:23:04
 */
@Controller
@RequestMapping(value = "file")
public class FileController {


	/**
	 * @desc 上传图片
	 * @param files
	 *            文件
	 * @param userId
	 *            用户id
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	// 前端先上传图片预览生成图片id 给图片右上角一个删除图标 点击时remove(id) 压缩或者不压缩放入到一个数组里统一上传file
	@RequestMapping("/uploadFile") // 同时上传多张文件前端数组存储之后点保存 统一上传 集修改删除于一体
	@ResponseBody
	public Map<String, Object> save(@RequestParam(value = "file", required = false) MultipartFile[] files,
			String userId) throws IllegalStateException, IOException {
		List<String> fileUrls = new ArrayList<>();
		List<String> fileNames = new ArrayList<>();
		for (MultipartFile file : files) {
			//文件名称
			String fileName = file.getOriginalFilename();
			//文件后缀
			String fileType = fileName.substring(fileName.indexOf("."), fileName.length());
			// 文件InputStream
			InputStream fileInputStream  = file.getInputStream();
			String url = PutFileUtils.Putimgs(fileInputStream, fileType);

			if (url!=null) {// 如果文件存在
				fileUrls.add(url);
				fileNames.add(fileName);
			}
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("errno", 0);
		map.put("data", fileUrls);
		return map;
	}

	@RequestMapping("/uploadeditorFile") // 同时上传多张文件前端数组存储之后点保存 统一上传 集修改删除于一体
	@ResponseBody
	public Map<String, Object> uploadFile(@RequestParam(value = "files", required = false) MultipartFile[] files,
			String userId) throws IllegalStateException, IOException {
		List<String> fileUrls = new ArrayList<>();
		List<String> fileNames = new ArrayList<>();
		for (MultipartFile file : files) {
			//文件名
			String fileName = file.getOriginalFilename();
			// 后缀
			String fileType = fileName.substring(fileName.indexOf("."), fileName.length());
			// 文件InputStream
			InputStream fileInputStream  = file.getInputStream();
			String url = PutFileUtils.Putimgs(fileInputStream, fileType);
					
			if (url!=null) {// 如果文件存在
				fileUrls.add(url);
				fileNames.add(fileName);
			}
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("errno", 0);
		map.put("data", fileUrls);
		return map;
	}
}
