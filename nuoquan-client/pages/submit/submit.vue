<template>
	<view class="news-wrap">
		<!-- 第一层：选择是否匿名，返回，发布 -->
		<form @submit="formSubmit">
		<view class="news-option-part">
			<!-- 返回按钮 -->
			<view class="news-return-icon">
				<image class="news-return-icon-img" src="../../static/left-circle.png"></image>
			</view>
			<view class="test111">
			<!-- 选择是否匿名 -->
			<view class="news-anonymity-select">
				<switch name="switchAnonymous" type="checkbox" class="anonymous-switch">匿名</switch>
			</view>
			<!-- 提交表单 -->
			<view class="news-submit-button">
				<button class="NewsSubmitButton" form-type="submit">发表</button>
			</view>
			</view>
		</view>
		<!-- 第二层：文章标题，标签，具体内容 -->
		<view class="news-content">
			<view>
			<navigator url="../getColor/getColor">
				<button type="default">跳转到getClolor页面</button>
			</navigator>
			</view>
			<!-- 添加文章标题 -->
			<view class="news-content-title">
				<input name="inputTitle" confirm-type="next" placeholder="标题" maxlength="30" class="news-content-title-text" focus="true"/>
			</view>
			<!-- 添加文章标签 -->				
			<view class="news-content-tag">
				<input name="inputTag" confirm-type="next" placeholder=" 添加标签" maxlength="10" class="news-content-tag-text" />
				<image class="new-content-tag-img" src="../../static/plus.png"></image>
			</view>
			<!-- 添加文章具体内容 -->
			<view class="news-content-text">
				<textarea name="contentTA" class="news-content-zhengwen" placeholder="正文"></textarea>
			</view>
			<!-- 添加图片选项 -->
			<view class="news-add-image">
				<view class="news-image">
					<p>这里可以添加图片</p>
					<image class="news-add-image-img" :src="contentImage" @click="changeImage"></image>
				</view>
			</view>
		</view>
		</form>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				contentImage : "../../static/plus-circle.png",
				imageCount : 3
			}
		},
		onLoad() {

		},
		methods: {
			formSubmit : function(e) {
					console.log('form发生了submit事件，携带数据为：' + JSON.stringify(e.detail.value))
			},
			changeImage : function(){
				var that = this;
				uni.chooseImage({
					count: 3,
					sizeType: ['compressed'],
					sourceType: ['album'],
					success: function (res) {
						var tempFilePaths = res.tempFilePaths;
						console.log(JSON.stringify(res.tempFilePaths));
					
						uni.showLoading({
							title: '上传中...'
						})
						var serverUrl = that.$serverUrl;
						uni.uploadFile({
							url: serverUrl + '/user/uploadFace?userId=' + 'aasa' ,
							filePath: tempFilePaths[0],
							name: 'file',
							header: {
								'content-type' : 'application/json' //默认值
							},
							success: function (res) {
								var data = JSON.parse(res.data);
								console.log(data);
								uni.hideLoading();
								uni.showToast({
									title: '上传成功！～～',
									icon: "success"
								});
								
								var imageUrl = data.data;
								// console.log(serverUrl);
								// console.log(imageUrl);
								that.contentImage = serverUrl + imageUrl;
								console.log(serverUrl + imageUrl);
							}
						});
					
					}
				});
			},
			
			
		}
	}
</script>
<style>
/* 	@import url("index.css");
 */</style>
