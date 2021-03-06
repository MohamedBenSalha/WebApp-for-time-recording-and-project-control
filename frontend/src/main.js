import Vue from 'vue'
import Vuesax from 'vuesax'
import App from './App.vue'
import 'vuesax/dist/vuesax.css' //Vuesax styles
import 'material-icons/iconfont/material-icons.css';
// Vuex Store
import store from './store/store'

//Searchbar with Recomandations
import Autocomplete from '@trevoreyre/autocomplete-vue'
import '@trevoreyre/autocomplete-vue/dist/style.css'
Vue.use(Autocomplete)

//Vue Import CSV
import VuePapaParse from 'vue-papa-parse'
Vue.use(VuePapaParse)


// Theme Configurations
import 'prismjs'
import 'prismjs/themes/prism.css'
import VsPrism from './components/prism/VsPrism.vue';
Vue.component(VsPrism.name, VsPrism);

// Leaflet Map
import { LMap, LTileLayer, LMarker } from 'vue2-leaflet';
import 'leaflet/dist/leaflet.css';

Vue.component('l-map', LMap);
Vue.component('l-tile-layer', LTileLayer);
Vue.component('l-marker', LMarker);

//Animated Counter
import VueNumber from 'vue-number-animation'
Vue.use(VueNumber)


// Vue Router
import router from './router'
Vue.config.productionTip = false
Vue.config.devtools = true
Vue.use(Vuesax)
 new Vue({
  store,
  router,
  render: h => h(App),
}).$mount('#app')
import '@/assets/scss/style.scss'