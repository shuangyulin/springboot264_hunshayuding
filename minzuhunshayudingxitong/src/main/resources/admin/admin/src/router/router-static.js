import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gonggao from '@/views/modules/gonggao/list'
    import shangpin from '@/views/modules/shangpin/list'
    import shangpinCollection from '@/views/modules/shangpinCollection/list'
    import shangpinLiuyan from '@/views/modules/shangpinLiuyan/list'
    import sheyingshiCollection from '@/views/modules/sheyingshiCollection/list'
    import sheyingshiCommentback from '@/views/modules/sheyingshiCommentback/list'
    import sheyingshiLiuyan from '@/views/modules/sheyingshiLiuyan/list'
    import sheyingshiOrder from '@/views/modules/sheyingshiOrder/list'
    import yonghu from '@/views/modules/yonghu/list'
    import sheyingshi from '@/views/modules/sheyingshi/list'
    import config from '@/views/modules/config/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryPaishedi from '@/views/modules/dictionaryPaishedi/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangpin from '@/views/modules/dictionaryShangpin/list'
    import dictionaryShangpinCollection from '@/views/modules/dictionaryShangpinCollection/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionarySheyingshiCollection from '@/views/modules/dictionarySheyingshiCollection/list'
    import dictionarySheyingshiOrder from '@/views/modules/dictionarySheyingshiOrder/list'
    import dictionaryShijianduan from '@/views/modules/dictionaryShijianduan/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryPaishedi',
        name: '拍摄地',
        component: dictionaryPaishedi
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangpin',
        name: '作品类型',
        component: dictionaryShangpin
    }
    ,{
        path: '/dictionaryShangpinCollection',
        name: '收藏表类型',
        component: dictionaryShangpinCollection
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionarySheyingshiCollection',
        name: '收藏表类型',
        component: dictionarySheyingshiCollection
    }
    ,{
        path: '/dictionarySheyingshiOrder',
        name: '订单类型',
        component: dictionarySheyingshiOrder
    }
    ,{
        path: '/dictionaryShijianduan',
        name: '时间段',
        component: dictionaryShijianduan
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/gonggao',
        name: '公告',
        component: gonggao
      }
    ,{
        path: '/shangpin',
        name: '作品',
        component: shangpin
      }
    ,{
        path: '/shangpinCollection',
        name: '作品收藏',
        component: shangpinCollection
      }
    ,{
        path: '/shangpinLiuyan',
        name: '作品留言',
        component: shangpinLiuyan
      }
    ,{
        path: '/sheyingshiCollection',
        name: '摄影师收藏',
        component: sheyingshiCollection
      }
    ,{
        path: '/sheyingshiCommentback',
        name: '摄影师评价',
        component: sheyingshiCommentback
      }
    ,{
        path: '/sheyingshiLiuyan',
        name: '摄影师留言',
        component: sheyingshiLiuyan
      }
    ,{
        path: '/sheyingshiOrder',
        name: '摄影师预约',
        component: sheyingshiOrder
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/sheyingshi',
        name: '摄影师',
        component: sheyingshi
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
