<template >
	<view class="index">
		<mainpagetop></mainpagetop>
		<!-- <mainpageleft></mainpageleft> -->
		<articlebrief v-for="(i, index) in showlist" :key="index" v-bind:articlecontent="i"></articlebrief>
	
	
	
	</view>
</template>

<script>
import articlebrief from '../../components/articlebrief'
import mainpagetop from '../../components/mainpagetop.vue'
import mainpageleft from '../../components/mainpageleft.vue'
export default {
	data() {
		return {
			showmenu:'1',
			title: 'Hello',
			hottitlelist: ['热门标题111', '热门标题222', '热门标题333'],
			showlist: [
				[
					'0001',
					'哪位告知一下轮滑广场哪个罗宾汉雕像怎么变成球了',
					'应该早就不叫轮滑广场了吧。。。。。。也不知道现在叫啥，就是19栋楼下那个，毕业之后那个夏天才把雕像建起来',
					'',
					'',
					'',
					'陈仅仅',
					'06-06 16：12'
				],
				[
					'0002',
					'后街的个人评测',
					'瘦肉羹 后街靠后的位置 说是瘦肉羹 但看起来就像是面粉吃起来有淡淡的瘦肉的味道 小料自己加 我觉得好吃',
					'/static/0001/pic1.jpg',
					'../../static/0001/pic2.jpg',
					'../../static/0001/pic3.jpg',
					'陈仅仅',
					'06-06 16：12'
				],
				[
					'0002',
					'后街的个人评测',
					'瘦肉羹 后街靠后的位置 说是瘦肉羹 但看起来就像是面粉吃起来有淡淡的瘦肉的味道 小料自己加 我觉得好吃',
					'/static/0001/pic1.jpg',
					'../../static/0001/pic2.jpg',
					'../../static/0001/pic3.jpg',
					'陈仅仅',
					'06-06 16：12'
				],
				[
					'0002',
					'后街的个人评测',
					'瘦肉羹 后街靠后的位置 说是瘦肉羹 但看起来就像是面粉吃起来有淡淡的瘦肉的味道 小料自己加 我觉得好吃',
					'/static/0001/pic1.jpg',
					'../../static/0001/pic2.jpg',
					'../../static/0001/pic3.jpg',
					'陈仅仅',
					'06-06 16：12'
				],
				[
					'0002',
					'后街的个人评测',
					'瘦肉羹 后街靠后的位置 说是瘦肉羹 但看起来就像是面粉吃起来有淡淡的瘦肉的味道 小料自己加 我觉得好吃',
					'/static/0001/pic1.jpg',
					'../../static/0001/pic2.jpg',
					'../../static/0001/pic3.jpg',
					'陈仅仅',
					'06-06 16：12'
				],
				[
					'0002',
					'后街的个人评测',
					'瘦肉羹 后街靠后的位置 说是瘦肉羹 但看起来就像是面粉吃起来有淡淡的瘦肉的味道 小料自己加 我觉得好吃',
					'/static/0001/pic1.jpg',
					'../../static/0001/pic2.jpg',
					'../../static/0001/pic3.jpg',
					'陈仅仅',
					'06-06 16：12'
				],
				[
					'0002',
					'后街的个人评测',
					'瘦肉羹 后街靠后的位置 说是瘦肉羹 但看起来就像是面粉吃起来有淡淡的瘦肉的味道 小料自己加 我觉得好吃',
					'/static/0001/pic1.jpg',
					'../../static/0001/pic2.jpg',
					'../../static/0001/pic3.jpg',
					'陈仅仅',
					'06-06 16：12'
				],
				[
					'0002',
					'后街的个人评测',
					'瘦肉羹 后街靠后的位置 说是瘦肉羹 但看起来就像是面粉吃起来有淡淡的瘦肉的味道 小料自己加 我觉得好吃',
					'/static/0001/pic1.jpg',
					'../../static/0001/pic2.jpg',
					'../../static/0001/pic3.jpg',
					'陈仅仅',
					'06-06 16：12'
				],
				[
					'0002',
					'后街的个人评测',
					'瘦肉羹 后街靠后的位置 说是瘦肉羹 但看起来就像是面粉吃起来有淡淡的瘦肉的味道 小料自己加 我觉得好吃',
					'/static/0001/pic1.jpg',
					'../../static/0001/pic2.jpg',
					'../../static/0001/pic3.jpg',
					'陈仅仅',
					'06-06 16：12'
				]
			]
		};
	},
	components: {
		articlebrief: articlebrief,
		mainpagetop,
		mainpageleft,
	},
	onLoad() {},
	methods: {
		show(){
			if(this.showmenu==0){
				this.showmenu=1;
			}else{this.showmenu=0}
		}
	}
};
</script>

<style>

.index{	background-color: #F3F3F3;
		}		

image {
	width: 60px;
	height: 60px;
	display: inline-block;
}
.touxiang {
	border-radius: 30px;
}
.search {
	display: inline-block;
	width: 70%;
	box-shadow: inset 0 0 20px #ccc;
	border-radius: 20upx;
	margin-left: 50upx;
}
.hot {
	background-color: #e4e4e4;
	width: 100%;
}
.hotitem {
	margin-bottom: 20px;
	background: white;
	height: 27px;
	border-color: rgb(255, 255, 255);
	box-shadow: rgb(170, 170, 170) 0px 0px 5px 0px;
	font-size: 14px;
	padding: 0px;
	border-width: 1px;
	border-style: solid;
	text-align: left;
	line-height: 20px;
	font-weight: normal;
	font-style: normal;
}
.arrow {
	width: 100upx;
	height: 60upx;
}
</style>
